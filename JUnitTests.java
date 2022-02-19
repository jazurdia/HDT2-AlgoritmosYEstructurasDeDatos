import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTests {

    @Test
    public void probarCalc(){
        Evaluador2 eval = new Evaluador2();
        assertEquals(2, eval.Evaluate("11+"));

    }

    @Test
    public void probarStack(){
        StackAL<Integer> pStack = new StackAL<Integer>();
        pStack.push(2);
        assertEquals(2, pStack.peek());
    }

}