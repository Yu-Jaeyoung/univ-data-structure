package list.common;

public interface ListInterface<E> {
    public void add(int k, E x);

    public void append(E x);

    public E remove(int k);

    public boolean removeItem(E x);

    public E get(int k);

    public void set(int k, E x);

    public int indexOf(E x);

    public int size();

    public boolean isEmpty();

    public void clear();

    public void printAll();
}
