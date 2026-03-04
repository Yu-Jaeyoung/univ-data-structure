package binarytree;

public interface IndexInterface<T, E> {
    void insert(Comparable<E> x);

    T search(Comparable<E> x);

    void delete(Comparable<E> x);
}
