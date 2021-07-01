public class ArrayBoundedStack <T> implements StackInterface<T>{

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
    public void push(T element) throws StackOverflowException {

        if(!isFull()){

        }

    }

    @Override
    public void pop() throws StackUnderflowException {

    }

    @Override
    public T top() throws StackUnderflowException {
        return null;
    }

    @Override
    public boolean isFull() {
        return (topIndex == (elements.length - 1));
    }
}
