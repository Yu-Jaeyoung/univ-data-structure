package stack.linkedstack;

import stack.common.StackInterface;

public class LinkedStack<E> implements StackInterface<E> {

    Node<E> topNode;

    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(E newItem) {
        topNode = new Node<E>(newItem, topNode);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        Node<E> temp = topNode;
        topNode = topNode.next;
        return temp.item;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }

        return topNode.item;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void popAll() {
        topNode = null;
    }

    public void printAll() {
        Node<E> node = topNode;

        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }
}
