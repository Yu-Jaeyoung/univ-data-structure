package stack.common;

public interface StackInterface<E> {
    void push(final E newItem);

    E pop();

    E top();

    boolean isEmpty();

    void popAll();
}
