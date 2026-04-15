package stackqueue.app;

import stackqueue.common.StackInterface;
import stackqueue.stack.arraystack.ArrayStack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Test Seq 12345";
        System.out.println("Input String: " + input);

        String answer = reverse(input);
        System.out.println("Reversed String: " + answer);
    }

    private static String reverse(String input) {
        StackInterface<Character> stack = new ArrayStack<>();
        char[] array = input.toCharArray();

        for (char c : array) {
            stack.push(c);
        }

        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }
}
