package queue.student;

import queue.common.QueueInterface;
import queue.linkedqueue.LinkedQueue;

public class Main {
    public static void main(String[] args) {
        QueueInterface<Student> queue = new LinkedQueue<>();
        queue.enqueue(new Student("홍일동", "010-2342-1312"));
        queue.enqueue(new Student("홍이동", "010-9314-1234"));
        queue.enqueue(new Student("홍삼동", "010-0367-1356"));

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
