package stackqueue.queue.arrayqueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
