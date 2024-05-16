package heap;

public class HeapMain {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>(5);

        try {
            heap.insert(10);
            heap.insert(8);
            heap.insert(3);
            heap.insert(5);
            heap.printAll();
            heap.deleteMax();
            heap.insert(7);
            heap.printAll();
        } catch (PriorityQueueException e) {
            e.printStackTrace();
        }
    }
}
