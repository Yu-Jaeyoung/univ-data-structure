package stackqueue.queue.linkedqueue;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
