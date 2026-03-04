package queue.arrayqueue;

import queue.common.QueueInterface;

public class ArrayQueue<E> implements QueueInterface<E> {

    private final E[] queue;
    private int front;
    private int tail;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public ArrayQueue() {
        queue = (E[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        tail = queue.length - 1;
        numItems = 0;
    }

    public ArrayQueue(int capacity) {
        queue = (E[]) new Object[capacity];
        front = 0;
        tail = queue.length - 1;
        numItems = 0;
    }

    @Override
    public void enqueue(E newItem) {
        if (isFull()) {
            System.err.println("Queue is full");
            return;
        } else {
            tail = (tail + 1) % queue.length;
            queue[tail] = newItem;
            numItems++;
        }
    }

    private boolean isFull() {
        return numItems == queue.length;
    }

    public E dequeue() {
        if (isFull()) {
            return null;
        } else {
            E item = queue[front];
            front = (front + 1) % queue.length;
            numItems--;
            return item;
        }
    }

    @Override
    public E front() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void dequeueAll() {
        front = 0;
        tail = queue.length - 1;
        numItems = 0;
    }
}
