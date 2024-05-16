package heap;

public class Heap<E extends Comparable<E>> implements PriorityQueueInterface<E> {
    private E[] items;
    private int numItems;

    public Heap(int arraySize) {
        items = (E[]) new Comparable[arraySize];
        numItems = 0;
    }

    public Heap(E[] B, int numElements) {
        items = B; // 배열 레퍼런스 복사
        numItems = numElements;
    }

    @Override
    public void insert(final E newItem) throws PriorityQueueException {
        if (numItems >= items.length) {
            throw new PriorityQueueException("Heap is full");
        }

        items[numItems] = newItem;
        percolateUp(numItems);
        numItems++;
    }

    private void percolateUp(int numItems) {
        int parent = (numItems - 1) / 2;
        if (numItems > 0 && items[numItems].compareTo(items[parent]) > 0) {
            E tmp = items[numItems];
            items[numItems] = items[parent];
            items[parent] = tmp;
            percolateUp(parent);
        }
    }

    @Override
    public E deleteMax() throws PriorityQueueException {
        if (!isEmpty()) {
            E max = items[0];
            items[0] = items[numItems - 1];
            numItems--;
            percolateDown(0);
            return max;
        } else {
            throw new PriorityQueueException("힙 오류: deleteMax()-Underflow");
        }
    }

    private void percolateDown(int i) {
        // A[i]를 루트로 스며내리기, A[n]: last item, boundary
        int child = 2 * i + 1; // left child
        int rightChild = 2 * i + 2; // right child
        if (child <= numItems - 1) {
            if (rightChild <= numItems - 1 && items[child].compareTo(items[rightChild]) < 0) {
                child = rightChild; // index of larger child
            }
            if (items[i].compareTo(items[child]) < 0) {
                E tmp = items[i];
                items[i] = items[child];
                items[child] = tmp;
                percolateDown(child);
            }
        }
    }

    @Override
    public E max() throws PriorityQueueException {
        if (!isEmpty()) {
            return items[0];
        } else {
            throw new PriorityQueueException("힙 오류: max()-Empty");
        }
    }

    public void buildHeap() {
        if (numItems < 2) {
            return;
        }

        for (int i = (((numItems - 1) - 1) / 2); i >= 0; i--) {
            percolateDown(i);
        }
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        numItems = 0;
    }

    public void printAll() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(items[i]);
        }
    }
}