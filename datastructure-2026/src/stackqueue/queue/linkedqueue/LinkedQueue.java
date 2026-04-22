package stackqueue.queue.linkedqueue;

import stackqueue.common.QueueInterface;

public class LinkedQueue<E> implements QueueInterface<E> {
    private Node<E> tail;
    private Node<E> front;

    public LinkedQueue() {
        tail = null;
        front = null;
    }

    @Override
    public void enqueue(E newItem) {
        Node<E> newNode = new Node<>();
        newNode.item = newItem;

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
            throw new RuntimeException("Queue is Empty");
        }

        E temp = tail.next.item;

        if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }

        return temp;
    }

    @Override
    public E front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        return tail.next.item;
    }

    @Override
    public boolean isEmpty() {
        return (tail == null);
    }

    @Override
    public void dequeueAll() {
        tail = null;
        front = null;
    }
}
