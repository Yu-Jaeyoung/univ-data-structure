package List.linkedlist;

public interface IntegerListInterface {
    public void add(int k, Integer x);

    public void append(Integer x);

    public Integer remove(int k);

    public boolean removeItem(Integer x);

    public Integer get(int k);

    public void set(int k, Integer x);

    public int indexOf(Integer x);

    public int size();

    public boolean isEmpty();

    public void clear();

    public void printAll();
}
