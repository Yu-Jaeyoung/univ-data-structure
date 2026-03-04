package list.arraylist_generic_v2;

public class ArrayList<E> implements ListInterface<E> {
    private static final int DEFAULT_CAPACITY = 64;

    private E[] items;
    private int numItems;

    // 작성자가 제네릭 E로 캐스팅되는 것을 보장
    // 일반적으로는 사용하지 않는것이 좋음
    @SuppressWarnings("unchecked")
    public ArrayList() {
        this.items = (E[]) new Object[DEFAULT_CAPACITY];
        this.numItems = 0;
    }

    @SuppressWarnings("unchecked")
    public ArrayList(final int capacity) {
        this.items = (E[]) new Object[capacity];
        this.numItems = 0;
    }

    @Override
    public void add(final int k, final E x) {

        // 배열의 중간은 비우지 않는다.
        if (k < 0 || k > numItems) {
            return;
        }

        if (numItems >= items.length) {
            increaseCapacity();
        }

        for (int i = numItems - 1; i >= k; i--) {
            items[i + 1] = items[i];
        }

        items[k] = x;
        numItems++;

    }

    private void increaseCapacity() {

        E[] newItems = (E[]) new Object[items.length * 2];

        for (int i = 0; i < numItems; i++) {
            newItems[i] = items[i];
        }

        this.items = newItems;
    }

    @Override
    public void append(final E x) {
        if (numItems >= items.length) {
            increaseCapacity();
        }

        items[numItems++] = x;
    }

    @Override
    public E remove(final int k) {
        if (isEmpty() || k < 0 || k > numItems - 1) {
            System.out.println("리스트가 비었거나, 인덱스가 잘못되었습니다.");
            return null;
        }

        final E tmp = items[k];

        for (int i = k; i < numItems - 1; i++) {
            items[i] = items[i + 1];
        }

        numItems--;

        return tmp;
    }

    @Override
    public boolean removeItem(final E x) {

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
    public E get(final int k) {
        if (k >= 0 && k <= numItems - 1) {
            return items[k];
        } else {
            return null;
        }
    }

    @Override
    public void set(final int k, final E x) {
        if (k >= 0 && k <= numItems - 1) {
            items[k] = x;
        } else {
            System.out.println("인덱스가 잘못되었습니다.");
        }
    }

    @Override
    public int indexOf(final E x) {

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
