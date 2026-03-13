package exercise;

public class IndexOutOfBoundsTryCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 범위를 벗어났습니다.");
        }

        System.out.println("프로그램이 계속 실행됩니다.");
    }
}
