package ArrayListStack;

import Exceptions.StackUnderflowException;
import Interface.StackInterface;

import java.util.ArrayList;

public class ArrayListStack<T> implements StackInterface<T> {

    protected ArrayList<T> elements; // ArrayList that holds stack elements

    public ArrayListStack() {
        elements = new ArrayList<T>();
    }


    @Override
    public void push(T element) {
        elements.add(element);
    }

    @Override
    public void pop() {
        if(isEmpty()){
            throw new StackUnderflowException("Pop attempted on empty stack");
        }else{
            elements.remove(elements.size() - 1);
        }
    }

    @Override
    public T top() {
        T topOfStack = null;
        if(isEmpty()){
            throw new StackUnderflowException("Top attempted on empty stack");
        }else{
            topOfStack = elements.get(elements.size() - 1);
        }
        return topOfStack;
    }

    @Override
    public boolean isFull() {
        return false;
        // ArrayLists are never full
    }

    @Override
    public boolean isEmpty() {
        return (elements.size() == 0);
    }
}
