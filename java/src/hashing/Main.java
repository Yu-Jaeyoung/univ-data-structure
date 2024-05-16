package hashing;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ChainedHashTable hashTable = new ChainedHashTable(10);
        ArrayHashTable hashTable = new ArrayHashTable(10);

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(1, 100);
            hashTable.insert(x);
            System.out.println("input = " + x);
            System.out.println("search = " + hashTable.search(x));
        }

        System.out.println("search = " + hashTable.search(50));
    }
}
