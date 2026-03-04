package list.arraylist_generic_v1;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 64;

    private E[] items;
    private int numItems;

    // 작성자가 제네릭 E로 캐스팅되는 것을 보장
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

    public void add(final int k, final E x) {

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

    public void append(final E x) {
        if (numItems >= items.length) {
            System.out.println("용량이 초과되었습니다.");
            return;
        }

        items[numItems++] = x;
    }

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

    public E get(final int k) {
        if (k >= 0 && k <= numItems - 1) {
            return items[k];
        } else {
            return null;
        }
    }

    public void set(final int k, final E x) {
        if (k >= 0 && k <= numItems - 1) {
            items[k] = x;
        } else {
            System.out.println("인덱스가 잘못되었습니다.");
        }
    }

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

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public void clear() {
        numItems = 0;
    }

    public void printAll() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(items[i]);
        }
    }
}
