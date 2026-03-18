package list.arraylist;

public class Main {
    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();
        list.add(0, 300);
        list.add(1, 400);
        list.add(0, 500);
        list.append(600);
        list.printAll();

        Integer removeItem = list.remove(2);
        System.out.println(removeItem);
        list.printAll();

        boolean result1 = list.removeItem(400);
        boolean result2 = list.removeItem(300);
        System.out.println(result1 + ", " + result2);
        list.printAll();
    }
}
