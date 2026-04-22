package stackqueue.app;

import stackqueue.common.QueueInterface;
import stackqueue.common.StackInterface;
import stackqueue.queue.arrayqueue.ArrayQueue;
import stackqueue.stack.arraystack.ArrayStack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome Check!");
        String str = "lioninoil"; // 테스트 문자열
        boolean t = isPalindrome(str);
        System.out.println("Is " + str + " Palindrome?: " + t);
    }

    private static boolean isPalindrome(final String A) {
        StackInterface<Character> stack = new ArrayStack<>();
        QueueInterface<Character> queue = new ArrayQueue<>();
        for (int i = 0; i < A.length(); i++) {
            stack.push(A.charAt(i)); // 문자열 A의 i번째 문자
            queue.enqueue(A.charAt(i));
        }
        while (!queue.isEmpty() && stack.pop() == queue.dequeue()) {
        }
        if (queue.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

