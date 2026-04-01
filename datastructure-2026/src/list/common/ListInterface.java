package list.common;

public interface ListInterface<E> {
    public void add(final int k, final E x);

    public void append(final E x);

    public E remove(final int k);

    public boolean removeItem(final E x);

    public E get(final int k);

    public void set(final int k, final E x);

    public int indexOf(final E x);

    public int size();

    public boolean isEmpty();

    public void clear();

    public void printAll();

    public void printAll(final String delimiter);
}
