package stackqueue.queue.arrayqueue;

import stackqueue.common.QueueInterface;

public class ArrayQueue<E> implements QueueInterface<E> {

    private static final int DEFAULT_CAPACITY = 64;

    private E[] queue;
    private int front;
    private int tail;
    private int numItems;

    public ArrayQueue() {
        queue = (E[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        tail = -1;
        numItems = 0;
    }


    @Override
    public void enqueue(E newItem) {
        if (isFull()) {
            throw new RuntimeException("Queue is Full");
        }

        tail = (tail + 1) % queue.length;
        queue[tail] = newItem;
        numItems++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        E temp = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        numItems--;

        return temp;
    }

    @Override
    public E front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        return queue[front];
    }

    private boolean isFull() {
        return (numItems == queue.length);
    }

    @Override
    public boolean isEmpty() {
        return (numItems == 0);
    }

    @Override
    public void dequeueAll() {
        front = 0;
        tail = -1;
        numItems = 0;
    }
}
