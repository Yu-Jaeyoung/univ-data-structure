package exercise;

public class IndexOutOfBoundsCause {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 3;

        System.out.println("배열의 길이는 " + arr.length + "입니다.");
        System.out.println("사용할 수 있는 인덱스는 0부터 " + (arr.length - 1) + "까지입니다.");
        System.out.println("index가 " + index + "이므로 범위를 벗어나 ArrayIndexOutOfBoundsException이 발생합니다.");

        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("수정 방법: arr.length 범위 안에서만 접근해야 합니다.");
            System.out.println("예를 들면 arr[2]는 정상적으로 접근할 수 있습니다: " + arr[2]);
        }
    }
}
