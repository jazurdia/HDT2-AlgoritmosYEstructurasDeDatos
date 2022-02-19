package main;

import java.util.ArrayList;

public class StackAL<T> implements IStack<T> {

    private ArrayList<T> pila;

    public StackAL() {
        pila = new ArrayList<T>();

    }

    @Override
    public void push(T value) {
        pila.add(0, value);

    }

    @Override
    public T pull() {
        T temp = pila.get(0);
        pila.remove(0);
        return temp;
    }

    @Override
    public T peek() {
        return pila.get(0);
    }

    @Override
    public int count() {
        return pila.size();
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    @Override
    public String toString() {

        String stackToString = "";

        for (int i = 0; i < pila.size(); i++) {
            stackToString = stackToString + "," + pila.get(i);
        }

        return stackToString;

    }

}
