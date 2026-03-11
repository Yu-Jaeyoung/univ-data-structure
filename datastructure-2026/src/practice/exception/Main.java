package practice.exception;

public class Main {
    static void main() {
        try {
            Heap heap = new Heap(3);
            heap.insert(1);
            heap.insert(2);
            heap.insert(3);
            heap.insert(3);
        } catch (HeapException e) {
            System.err.println(e.getMessage());
        }
    }
}
