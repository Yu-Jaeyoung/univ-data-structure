package list.arraylist.primitive;

public class IntegerArrayList implements IntegerListInterface {
    private Integer[] items;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public IntegerArrayList() {
        this.items = new Integer[DEFAULT_CAPACITY];
        this.numItems = 0;
    }

    @Override
    public void add(final int k, final Integer x) {
        if (numItems >= items.length) {
            return;
        }

        if (k < 0 || k > numItems) {
            return;
        }

        for (int i = numItems - 1; i >= k; i--) {
            items[i + 1] = items[i];
        }
        items[k] = x;
        numItems++;
    }

    @Override
    public void append(final Integer x) {
        if (numItems >= items.length) {
            return;
        }

        items[numItems++] = x;
    }

    @Override
    public Integer remove(final int k) {
        if (isEmpty()) {
            return null;
        }

        if (k < 0 || k > numItems - 1) {
            return null;
        }

        Integer tmp = items[k];

        for (int i = k; i <= numItems - 2; i++) {
            items[i] = items[i + 1];
        }

        numItems--;

        return tmp;
    }

    @Override
    public boolean removeItem(final Integer x) {
        int k = 0;

        while (k < numItems && !items[k].equals(x)) {
            k++;
        }

        if (k == numItems) {
            return false;
        }

        for (int i = k; i <= numItems - 2; i++) {
            items[i] = items[i + 1];
        }

        numItems--;

        return true;
    }

    @Override
    public Integer get(int k) {
        if (k < 0 || k > numItems - 1) {
            return null;
        }

        return items[k];
    }

    @Override
    public void set(int k, Integer x) {
        if (k < 0 || k > numItems - 1) {
            return;
        }

        items[k] = x;
    }

    @Override
    public int indexOf(Integer x) {
        int k = 0;

        while (k < numItems && !items[k].equals(x)) {
            k++;
        }

        if (k == numItems) {
            return -1;
        }

        return k;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        numItems = 0;
    }

    @Override
    public void printAll() {
        System.out.print("List: ");

        for (int i = 0; i < numItems; i++) {
            if (i == numItems - 1) {
                System.out.println(items[i]);
            } else {
                System.out.print(items[i] + ", ");
            }
        }
    }
}
