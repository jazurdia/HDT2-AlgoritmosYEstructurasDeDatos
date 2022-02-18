import java.util.ArrayList;

public class StackAL<T> implements IStack<T>{

    private ArrayList<T> pila;

    public StackAL(){
        pila = new ArrayList<T>();

    }

    @Override
    public void push(T value) {
        pila.add(0, value);
        
    }

    @Override
    public T pull() {
        return pila.remove(0);
    }

    @Override
    public T peek() {
        pila.get(0);
        return null;
    }

    @Override
    public int count() {
        return pila.size();
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }
    
}
