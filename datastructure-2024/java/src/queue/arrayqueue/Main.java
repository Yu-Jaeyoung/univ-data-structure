package queue.arrayqueue;

import queue.common.QueueInterface;

public class Main {
    public static void main(String[] args) {
        QueueInterface<String> queue = new ArrayQueue<>();
        queue.enqueue("아침");
        queue.enqueue("점심");
        queue.enqueue("저녁");
        queue.enqueue("야식");

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
