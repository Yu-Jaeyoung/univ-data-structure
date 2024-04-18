package queue.app;

import java.util.Scanner;
import queue.arrayqueue.ArrayQueue;
import queue.arraystack.ArrayStack;
import queue.common.QueueInterface;
import queue.common.StackInterface;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        boolean result = isPalindrome(inputString);

        if (result) {
            System.out.println("좌우동형 문자열이 맞습니다.");
        } else {
            System.out.println("좌우동형 문자열이 아닙니다.");
        }
    }

    private static boolean isPalindrome(String inputString) {
        StackInterface<Character> stack = new ArrayStack<>();
        QueueInterface<Character> queue = new ArrayQueue<>();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
            queue.enqueue(inputString.charAt(i));
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.dequeue())) {
                return false;
            }
        }

        return true;
    }
}
