public class Evaluador implements IPosfixCalc {

    public Evaluador(){}

    @Override
    /**
     * Evaluate does the math on the code. 
     * @param expresion: it gives a string with the two one-digit numbers and an operation to perform. 
     * @return the result of the operation. 
     */
    public int Evaluate(String expresion) { // recibirá 

        StackAL<String> stack = new StackAL<String>();
        String[] expresionparts = expresion.split("|");
        int ans = 0;
        //List<String> partslist = Arrays.asList(expresionparts);

        for(int i = 0; i <= expresionparts.length; i++ ){
            if( Character.isDigit(expresion.charAt(i))){
                stack.push(expresionparts[i]);
            } else if(expresionparts[i].equals("+")){
                int nA = Integer.parseInt(stack.peek());
                stack.pull();
                int nB = Integer.parseInt(stack.peek());
                stack.pull();
                ans = nA + nB;

            } else if(expresionparts[i].equals("-")){
                int nA = Integer.parseInt(stack.peek());
                stack.pull();
                int nB = Integer.parseInt(stack.peek());
                stack.pull();
                ans = nA - nB;
            
            } else if(expresionparts[i].equals("*")){
                int nA = Integer.parseInt(stack.peek());
                stack.pull();
                int nB = Integer.parseInt(stack.peek());
                stack.pull();
                ans = nA * nB;

            } else if(expresionparts[i].equals("/")){
                int nA = Integer.parseInt(stack.peek());
                stack.pull();
                int nB = Integer.parseInt(stack.peek());
                stack.pull();
                ans = nA / nB;
            
            }
        }
        return ans;
    }
    
}
