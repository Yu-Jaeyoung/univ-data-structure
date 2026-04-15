package stackqueue.stack.linkedstack;

import stackqueue.common.StackInterface;

public class LinkedStack<E> implements StackInterface<E> {
    private Node<E> topNode;

    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(E newItem) {
        //  Node<E> newNode = new Node<>();
        //  newNode.item = newItem;
        //  newNode.next = topNode;
        //  topNode = newNode;

        topNode = new Node<>(newItem, topNode);
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return topNode.item;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        Node<E> temp = topNode;
        topNode = topNode.next;
        return temp.item;
    }

    @Override
    public boolean isEmpty() {
        return (topNode == null);
    }

    @Override
    public void popAll() {
        topNode = null;
    }
}
