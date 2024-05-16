package heap;

public interface PriorityQueueInterface<E> {
    void insert(final E newItem) throws Exception;

    E deleteMax() throws Exception;

    E max() throws Exception;

    boolean isEmpty();

    void clear();
}
