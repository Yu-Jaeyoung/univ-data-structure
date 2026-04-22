package stackqueue.common;

public interface QueueInterface<E> {

    void enqueue(E newItem);

    E dequeue();

    E front();

    boolean isEmpty();

    void dequeueAll();

}
