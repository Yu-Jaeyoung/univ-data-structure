package arraylist1;

public class IntegerArrayList implements IntegerListInterface {

    private static final int DEFAULT_CAPACITY = 64;

    private final Integer[] items;
    private int numItems;

    public IntegerArrayList() {
        this.items = new Integer[DEFAULT_CAPACITY];
        this.numItems = 0;
    }

    public IntegerArrayList(final int capacity) {
        this.items = new Integer[capacity];
        this.numItems = 0;
    }

    @Override
    public void add(final int k, final Integer x) {

        // 배열의 중간은 비우지 않는다.
        if (numItems >= items.length || k < 0 || k > numItems) {
            /* 에러 처리 */
            System.out.println("용량을 초과했거나, 인덱스가 잘못되었습니다.");
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
            System.out.println("용량이 초과되었습니다.");
            return;
        }

        items[numItems++] = x;
    }

    @Override
    public Integer remove(final int k) {
        if (isEmpty() || k < 0 || k > numItems - 1) {
            System.out.println("리스트가 비었거나, 인덱스가 잘못되었습니다.");
            return null;
        }

        final Integer tmp = items[k];

        for (int i = k; i < numItems - 1; i++) {
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

        for (int i = k; i < numItems - 1; i++) {
            items[i] = items[i + 1];
        }

        numItems--;

        return true;
    }

    @Override
    public Integer get(final int k) {
        if (k >= 0 && k <= numItems - 1) {
            return items[k];
        } else {
            return null;
        }
    }

    @Override
    public void set(final int k, final Integer x) {
        if (k >= 0 && k <= numItems - 1) {
            items[k] = x;
        } else {
            System.out.println("인덱스가 잘못되었습니다.");
        }
    }

    @Override
    public int indexOf(final Integer x) {

        int i = 0;

        while (i < numItems && !items[i].equals(x)) {
            i++;
        }

        if (i == numItems) {
            return -1;
        }

        return i;
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
        for (int i = 0; i < numItems; i++) {
            System.out.println(items[i]);
        }
    }
}
