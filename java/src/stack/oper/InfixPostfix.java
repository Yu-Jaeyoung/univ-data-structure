package stack.oper;

import java.util.Scanner;

import java.util.Stack;

public class InfixPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("중위 표기식: ");
        String infix = scanner.nextLine(); // 예: (32 + 5) * 4 + 10 / 5
        String postfix = toPostfix(infix); // 예: 32 5 + 4 * 10 5 / +
        System.out.println("Input string: " + postfix);
        int answer = evaluate(postfix);
        System.out.println("Answer: " + answer);
        scanner.close();
    }

    public static String toPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isDigit(ch)) {
                postfix.append(ch);
                while (i + 1 < infix.length() && Character.isDigit(infix.charAt(i + 1))) {
                    postfix.append(infix.charAt(i + 1));
                    i++;
                }
                postfix.append(' ');
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+', '-':
                return 1;
            case '*', '/':
                return 2;
            default:
                return -1;
        }
    }

    private static int evaluate(String postfix) {
        int A, B;
        Stack<Integer> s = new Stack<>();
        boolean digitPreviously = false;
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                if (digitPreviously == true) {
                    int tmp = s.pop();
                    tmp = 10 * tmp + (ch - '0');
                    s.push(tmp);
                } else {
                    s.push(ch - '0');
                }
                digitPreviously = true;
            } else if (isOperator(ch)) {
                A = s.pop();
                B = s.pop();
                int val = operation(A, B, ch);
                s.push(val);
                digitPreviously = false;
            } else {
                digitPreviously = false;
            }
        }
        return s.pop();
    }

    private static int operation(int a, int b, char ch) {
        int val = 0;
        switch (ch) {
            case '+':
                val = b + a;
                break;
            case '-':
                val = b - a;
                break;
            case '*':
                val = b * a;
                break;
            case '/':
                val = b / a;
                break;
        }
        return val;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
