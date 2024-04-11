package stack.app;

import stack.common.StackInterface;
import stack.linkedstack.LinkedStack;

public class ReverseString {
    private static String reverse(String s) {
        StackInterface<Character> stack = new LinkedStack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

/*
        String output = "";
        while (!stack.isEmpty()) {
            output += stack.pop();
        }
        return output;
*/

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String input = "desserts";
        String output = reverse(input);
        System.out.println("input = " + input);
        System.out.println("output = " + output);

        // System.out.println(input.equals(output));
    }
}
