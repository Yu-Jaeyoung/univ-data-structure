package list.arraylist.primitive;

public interface IntegerListInterface {
    public void add(final int k, final Integer x);

    public void append(final Integer x);

    public Integer remove(final int k);

    public boolean removeItem(final Integer x);

    public Integer get(final int k);

    public void set(final int k, final Integer x);

    public int indexOf(final Integer x);

    public int size();

    public boolean isEmpty();

    public void clear();

    public void printAll();
}
