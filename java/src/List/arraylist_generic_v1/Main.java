package List.arraylist_generic_v1;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(0, 300);
        integerList.add(1, 500);
        integerList.append(800);

        integerList.printAll();

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add(0, "spring");
        stringList.add(1, "raining");
        stringList.append("summer");

        stringList.printAll();
    }
}
