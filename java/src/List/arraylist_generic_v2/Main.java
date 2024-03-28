package List.arraylist_generic_v2;

public class Main {
    public static void main(String[] args) {
        ListInterface<Integer> integerList = new ArrayList<>();

        integerList.add(0, 300);
        integerList.add(1, 500);
        integerList.append(800);

        integerList.printAll();

        ListInterface<String> stringList = new ArrayList<>();

        stringList.add(0, "spring");
        stringList.add(1, "raining");
        stringList.append("summer");

        stringList.printAll();
    }
}
