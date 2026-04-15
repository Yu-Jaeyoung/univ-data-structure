package stackqueue.common;

public interface StackInterface<E> {
    void push(final E newItem);

    E top();

    E pop();

    boolean isEmpty();

    void popAll();
}



