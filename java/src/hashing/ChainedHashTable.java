package hashing;

import hashing.linkedlist.LinkedList;

public class ChainedHashTable {
    static final Integer DELETED = -12345, NOT_FOUND = -1;

    private LinkedList<Integer>[] table;
    int numItems = 0;

    @SuppressWarnings("unchecked")
    public ChainedHashTable(int n) {
        table = (LinkedList<Integer>[]) new LinkedList[n];
        for (int i = 0; i < n; i++) {
            table[i] = new LinkedList<>();
        }
        numItems = 0;
    }

    private int hash(Integer x) {
        return x % table.length; // 간단한 예
    }

    public void insert(Integer x) {
        int slot = hash(x);
        table[slot].add(0, x);
        numItems++;
    }

    public Integer search(Integer x) {
        int slot = hash(x);
        if (table[slot].isEmpty()) {
            return null; // null list
        } else {
            int i = table[slot].indexOf(x);
            if (i == NOT_FOUND) {
                return null; // not exist
            } else {
                return table[slot].get(i);
            }
        }
    }

    public void delete(Integer x) {
        if (isEmpty()) { /* 에러 처리 */
        } else {
            int slot = hash(x);
            table[slot].removeItem(x);
            numItems--;
        }
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
        numItems = 0;
    }

}