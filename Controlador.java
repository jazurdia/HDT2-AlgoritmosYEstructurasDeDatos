import java.util.Scanner;

public class Controlador {
    
    Reader reader;
    Evaluador eval = new Evaluador();
    StackAL<String> stack = new StackAL<String>();
    
    public Controlador(){
        System.out.println("Ingresa la dirección del archivo que debe ser leído. ");
        Scanner scan = new Scanner(System.in);
        reader = new Reader(scan.nextLine());
        stack = reader.readFile();
        scan.close();

        for(int i = 0; i < stack.count(); i++){
            System.out.println(eval.Evaluate(stack.peek()));
            stack.pull();
        }

    }
}
