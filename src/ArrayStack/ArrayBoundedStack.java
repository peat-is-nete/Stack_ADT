package ArrayStack;

import Exceptions.StackOverflowException;
import Exceptions.StackUnderflowException;
import Interface.StackInterface;

public class ArrayBoundedStack <T> implements StackInterface<T> {

    protected final int DEFCAP = 100; // default capacity
    protected T[] elements; // holds stack elements
    protected int topIndex = -1; // index of top element in stack

    public ArrayBoundedStack() {
        elements = (T[]) new Object[DEFCAP];
    }

    public ArrayBoundedStack(int maxsize) {
        elements = (T[]) new Object[maxsize];
    }

    @Override
    public boolean isEmpty(){
        return (topIndex == -1);
    }


    @Override
    public void push(T element) {
        if(isFull()){
            throw new StackOverflowException("Push attempted on a full stack.");
        }else{
            topIndex++;
            elements[topIndex] = element;
        }
    }

    @Override
    public void pop() {
        if (isEmpty()){
            throw new StackUnderflowException("Pop attempted on empty stack.");
        }else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    @Override
    public T top() {
        T topOfStack = null;
        if (isEmpty())
            throw new StackUnderflowException("Top attempted on empty stack.");
        else
            topOfStack = elements[topIndex];
        return topOfStack;
    }

    @Override
    public boolean isFull() {
        return (topIndex == (elements.length - 1));
    }
}
