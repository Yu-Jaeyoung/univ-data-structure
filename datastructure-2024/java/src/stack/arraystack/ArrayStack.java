package stack.arraystack;

import stack.common.StackInterface;

public class ArrayStack<E> implements StackInterface<E> {

    private E[] stack;
    private int topIndex;

    private static final int DEFAULT_CAPACITY = 64;

    public ArrayStack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    public ArrayStack(final int capacity) {
        stack = (E[]) new Object[capacity];
        topIndex = -1;
    }


    @Override
    public void push(E newItem) {
        if (isFull()) {
            System.out.println("스택이 가득 찼습니다.");
            return;
        }
        stack[++topIndex] = newItem;
    }

    private boolean isFull() {
        return topIndex == stack.length - 1;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }

        return stack[topIndex--];
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }

        return stack[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void popAll() {
        topIndex = -1;
//        stack = (E[]) new Object[stack.length];
    }

    public void printAll() {
        for (int i = 0; i <= topIndex; i++) {
            System.out.println(stack[i]);
        }
    }
}
