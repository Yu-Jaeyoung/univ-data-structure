package recursion;

public class HanoiTower {

    static void move(int n, char a, char b, char c) {

        if (n <= 0) {
            return;
        }

        move(n - 1, a, c, b);

        System.out.println(a + "에 있는 원반 " + n + "을 " + c + "로 옮깁니다.");

        move(n - 1, b, c, a);
    }

    public static void main(String[] args) {
        move(2, 'A', 'B', 'C');
    }
}

