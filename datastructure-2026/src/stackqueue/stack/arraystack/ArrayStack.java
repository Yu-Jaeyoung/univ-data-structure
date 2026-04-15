package stackqueue.stack.arraystack;

import stackqueue.common.StackInterface;

public class ArrayStack<E> implements StackInterface<E> {

    private E[] stack;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;

    public ArrayStack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    @Override
    public void push(E newItem) {
        if (isFull()) {
            throw new RuntimeException("Stack is Full");
        }

        stack[++topIndex] = newItem;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return stack[topIndex];
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return stack[topIndex--];
    }

    @Override
    public boolean isEmpty() {
        return (topIndex == -1);
    }

    @Override
    public void popAll() {
        topIndex = -1;
    }

    private boolean isFull() {
        return (topIndex == stack.length - 1);
    }
}
