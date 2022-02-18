import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    String filepath;

    /**
     * Constructor of class reader. 
     * @param filepath the filepath in a string, so that the code knows what to read. 
     */
    public Reader(String filepath){
        this.filepath = filepath;
    }

    /**
     * readFile process the file, given the filepath in the constructor of the class. 
     * @return ArrayList containing the data that the calculator uses. 
     */
    public StackAL<String> readFile(){
        StackAL<String> rawdata = new StackAL<String>();
        try {
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                //String data = scanner.nextLine();
                rawdata.push(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error. ");
        }
        return rawdata;

    }
    
    
}
