import java.io.IOException;
import java.util.Scanner;

public class Controlador {

    Reader reader;
    Evaluador2 eval = new Evaluador2();
    StackAL<String> stack = new StackAL<String>();

    public Controlador() {
    }

    public void executeControlador() {
        System.out.println("Ingresa la dirección del archivo que debe ser leído. ");
        Scanner scan = new Scanner(System.in);
        reader = new Reader(scan.nextLine()); // path
        try {
            stack = reader.readFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Ha ocurrido un error en el método executeControlador");
        }
        scan.close();

        for (int i = 0; i < stack.count(); i++) {
            // System.out.println(eval.Evaluate(stack.peek()));
            int finaleAns = eval.Evaluate(stack.pull());
            System.out.println("Hemos llegado hasta aquí");
            System.out.println(finaleAns);

        }
    }
}
