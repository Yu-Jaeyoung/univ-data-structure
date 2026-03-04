package stack.oper;

import stack.arraystack.ArrayStack;

public class Postfix {
    public static void main(String[] args) {
        String postfix = "32 5 + 4 * 10 5 / +";
        int result = evaluate(postfix);
        System.out.println(result);
    }

    private static int evaluate(String postfix) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        boolean digitPreviously = false;

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {
                if (digitPreviously) {
                    int value = stack.pop();
                    value = value * 10 + (c - '0');
                    stack.push(value);
                } else {
                    stack.push(c - '0');
                }
                digitPreviously = true;
            } else if (isOperator(c)) {
                int a = stack.pop();
                int b = stack.pop();
                int result = operation(b, a, c);
                stack.push(result);
                digitPreviously = false;
            } else {
                digitPreviously = false;
            }
        }

        return stack.pop();
    }

    private static int operation(int b, int a, char c) {
        return switch (c) {
            case '+' -> b + a;
            case '-' -> b - a;
            case '*' -> b * a;
            case '/' -> b / a;
            default -> 0;
        };
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '*' || c == '/' || c == '-';
    }
}
