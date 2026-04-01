package list.linkedlist.generic;

import list.common.ListInterface;

public class LinkedList<E> implements ListInterface<E> {

    private int numItems;
    private Node<E> head;

    public LinkedList() {
        this.numItems = 0;
        head = new Node<>(null, null);
    }

    private Node<E> getNode(final int k) {
        if (k >= -1 && k <= numItems - 1) {
            Node<E> currNode = head;
            for (int i = 0; i <= k; i++) {
                currNode = currNode.next;
            }
            return currNode;
        } else {
            return null;
        }
    }

    @Override
    public void add(final int k, final E x) {
        if (k < 0 || k > numItems) {
            throw new RuntimeException("Wrong Index");
        }

        Node<E> prevNode = getNode(k - 1);
        prevNode.next = new Node<>(x, prevNode.next);
        numItems++;
    }

    @Override
    public void append(final E x) {
        Node<E> prevNode = head;

        while (prevNode.next != null) {
            prevNode = prevNode.next;
        }

        prevNode.next = new Node<>(x, null);
        numItems++;
    }

    @Override
    public E remove(final int k) {
        if (isEmpty()) {
            return null;
        }

        if (k < 0 || k > numItems - 1) {
            return null;
        }

        Node<E> prevNode = getNode(k - 1);

        E tmp = prevNode.next.item;

        prevNode.next = prevNode.next.next;
        numItems--;

        return tmp;
    }

    @Override
    public boolean removeItem(E x) {
        Node<E> currNode = head;
        Node<E> prevNode;

        for (int i = 0; i <= numItems - 1; i++) {
            prevNode = currNode;
            currNode = currNode.next;

            if (currNode.item.equals(x)) {
                prevNode.next = currNode.next;
                numItems--;

                return true;
            }
        }

        return false;
    }

    @Override
    public E get(int k) {
        return getNode(k).item;
    }

    @Override
    public void set(int k, E x) {
        getNode(k).item = x;
    }

    @Override
    public int indexOf(E x) {
        Node<E> currNode = head.next;

        for (int i = 0; i <= numItems - 1; i++) {
            if (currNode.item.equals(x)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        head = new Node<>(null, null);
        numItems = 0;
    }

    @Override
    public void printAll() {
        printAll(", ");
    }

    @Override
    public void printAll(final String delimiter) {
        Node<E> node = head.next;

        while (node != null) {
            if (node.next == null) {
                System.out.println(node.item);
            } else {
                System.out.print(node.item + delimiter);
            }
            node = node.next;
        }
    }
}
