package practice.recursion;

public class HanoiTower {
    static void move(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        }

        move(n - 1, a, c, b);

        System.out.println(a + "에 있는 원반 " + n + "을 " + b + "로 옮긴다.");

        move(n - 1, c, b, a);
    }

    static void main() {
        move(4, 'a', 'b', 'c');
    }
}
