import java.util.Arrays;
import java.util.List;

public class Evaluador2 implements IPosfixCalc {

    @Override
    public int Evaluate(String expresion) {

        StackAL<Integer> numStack = new StackAL<Integer>();
        // List<String> expresionparts = Arrays.asList(expresion.split("|"));
        String[] arrayExpresions = expresion.split("|");

        // System.out.println(Arrays.toString(arrayExpresions));
        List<String> listExpresions = Arrays.asList(arrayExpresions);
        int ans = 0;
        for (int i = 0; i < listExpresions.size(); i++) {

            if (Character.isDigit(expresion.charAt(i))) { // Si es un número, irá al stack "numstack"
                numStack.push(Integer.parseInt(listExpresions.get(i)));

            } else if (listExpresions.get(i).equals("+")) { // operación suma. Los últimos dos elementos de numstack
                                                            // serán sumados y eliminados.
                int a = numStack.pull();
                int b = numStack.pull();
                ans = a + b;

            } else if (listExpresions.get(i).equals("-")) { // operación resta. Los últimos dos elementos de numstack
                                                            // serán restados y eliminados.
                int a = numStack.pull();
                int b = numStack.pull();
                ans = a - b;

            } else if (listExpresions.get(i).equals("*")) { // operación producto. Los últimos dos elementos de numstack
                                                            // serán multiplicados y eliminados.
                int a = numStack.pull();
                int b = numStack.pull();
                ans = a * b;

            } else if (listExpresions.get(i).equals("/")) { // operación division. Los últimos dos elementos de numstack
                                                            // serán divididos y eliminados.

                int a = numStack.pull();
                int b = numStack.pull();
                ans = a / b;

            }
        }
        return ans;

    }

}
