package exercise;

public class GenericPocketDemo {
    public static void main(String[] args) {
        Pocket<String> wordPocket = new Pocket<>();
        wordPocket.set("Java");
        System.out.println("wordPocket: " + wordPocket.get());

        Pocket<Integer> numberPocket = new Pocket<>();
        numberPocket.set(2026);
        System.out.println("numberPocket: " + numberPocket.get());
    }
}

class Pocket<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
