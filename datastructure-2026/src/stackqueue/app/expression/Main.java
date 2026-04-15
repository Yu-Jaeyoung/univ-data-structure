package stackqueue.app.expression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infix= scanner.nextLine(); // (32 + 5) * 4 + 10 /5
        System.out.println("Infix: " + infix);

        String postfix = InfixPostfix.toPostfix(infix);  // 32 5 + 4 * 10 5 / +
        System.out.println("Postfix: "+ postfix);

        int answer = InfixPostfix.evaluate(postfix);
        System.out.println("Calculate Result: " + answer);

        scanner.close();
    }
}
