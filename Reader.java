import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    try {
        File file = new File("filename.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    
}
