package exercise;

public class GenericMethodDemo {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange"};
        Integer[] numbers = {10, 20, 30};

        String firstFruit = getFirst(fruits);
        Integer firstNumber = getFirst(numbers);

        System.out.println("첫 번째 과일: " + firstFruit);
        System.out.println("첫 번째 숫자: " + firstNumber);
    }

    public static <T> T getFirst(T[] values) {
        return values[0];
    }
}
