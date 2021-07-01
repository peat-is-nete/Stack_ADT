package Interface;

import Exceptions.StackOverflowException;
import Exceptions.StackUnderflowException;

public interface StackInterface<T> {

    void push( T element) throws StackOverflowException;
    // Throws stacks.StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.


    void pop() throws StackUnderflowException;
    // Throws stacks.StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.


    T top() throws StackUnderflowException;
    // Throws stacks.StackUnderflowException if this stack is empty,
    // Otherwise returns top element of this stack.

    boolean isFull();
    // Returns true if this stack is full, otherwise returns false.

    boolean isEmpty();
    // Returns true if this stack is empty, otherwise returns false.



}
