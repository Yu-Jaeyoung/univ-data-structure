package list.arraylist;

public interface IntegerListInterface {
    public void add(final int i, final Integer x);

    public void append(final Integer x);

    public Integer remove(final int i);

    public boolean removeItem(final Integer x);

    public Integer get(final int i);

    public void set(final int i, final Integer x);

    public int indexOf(final Integer x);

    public int size();

    public boolean isEmpty();

    public void clear();

    public void printAll();
}
