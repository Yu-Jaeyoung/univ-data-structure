package collection.framework.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(final String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(-1);
        list.add(2, 100);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int sum = 0;

        it = list.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }

        System.out.println(sum);
    }
}
