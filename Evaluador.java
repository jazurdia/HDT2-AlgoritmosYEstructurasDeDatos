public class Evaluador implements IPosfixCalc {

    public Evaluador(){}

    @Override
    /**
     * Evaluate does the math on the code. 
     * @param expresion: it gives a string with the two one-digit numbers and an operation to perform. 
     * @return the result of the operation. 
     */
    public int Evaluate(String expresion) {

        String[] parts = expresion.split(" ");
        int numberA = 0;
        int numberB = 0;
        int ans = 0;
        
        try {
            numberA = Integer.parseInt(parts[0]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Ha ocurrido un error. ");
        }

        try {
            numberB = Integer.parseInt(parts[1]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Ha ocurrido un error. ");
        }

        switch (parts[2]) {
            case "+":
                ans = numberA + numberB;
                break;
        
            case "-":
                ans = numberA - numberB;
                break;

            case "*":
                ans = numberA * numberB;
                break;
            
            case "/": 
                ans = numberA/numberB;
                break;
        }

        return ans;
    }
    
}
