package practice.recursion;

public class Factorial {
    static int fact_iter(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
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

    public static void main(String[] args) {
        System.out.println(fact_iter(3));
        System.out.println(fact_rec(3));
    }
}
