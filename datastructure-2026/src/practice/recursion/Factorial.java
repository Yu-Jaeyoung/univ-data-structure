package practice.recursion;

public class Factorial {
    static int fact_iter(int n) {
        int result = 1;

        for (int i = 1; i < n; i++) {

            result *= i;
        }

        return result;
    }

    static int fact_rec(int n) {
        // n! = n * (n-1)!

        if (n <= 0) {
            return 1;
        }

        return n * fact_rec(n - 1);
    }

    static void main() {
        System.out.println(fact_iter(4));
        System.out.println(fact_rec(3));
    }
}
