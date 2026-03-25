package list.arraylist.generic;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "300");
        list.add(1, "400");
        list.add(0, "500");
        list.append("600");
        list.printAll();

        String removeItem = list.remove(2);
        System.out.println(removeItem);
        list.printAll();

        String getItem = list.get(2);
        System.out.println(getItem);

        int index = list.indexOf("500");
        System.out.println(index);

        list.set(3, "100");
        list.printAll();

        list.clear();
        list.printAll();
    }
}
