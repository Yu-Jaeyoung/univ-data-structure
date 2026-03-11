package practice.exception;

public class Heap {
    private int[] items;
    private int size;   
    private int maxHeap;

    public Heap(final int n) {
        this.items = new int[n];
        this.size = 0;
        this.maxHeap = n;
    }

    public void insert(final int newItem) throws HeapException {
        if (this.size == this.maxHeap) {
            throw new HeapException("Index Out of Bounds");
        }

        this.items[size] = newItem;
        size++;
    }
}
