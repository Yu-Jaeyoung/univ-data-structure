package queue.linkedqueue;

import queue.common.QueueInterface;

public class LinkedQueue<E> implements QueueInterface<E> {

    private Node<E> tail;

    @Override
    public void enqueue(E newItem) {
        Node<E> newNode = new Node<>(newItem, null);
        if (isEmpty()) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        E tmp = tail.next.item;

        if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }

        return tmp;
    }

    @Override
    public E front() {
        return tail.next.item;
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public void dequeueAll() {
        tail = null;
    }
}
