package hashing;

public class ArrayHashTable {
    private Integer table[];
    int numItems;
    static final Integer DELETED = -12345, NOT_FOUND = null; // auto boxing

    public ArrayHashTable(int n) {
        table = new Integer[n];
        numItems = 0;
        for (int i = 0; i < n; i++) {
            table[i] = null;
        }
    }

    private int hash(int i, Integer x) {
        return (x + i) % table.length; // 선형 탐색
    }

    public Integer search(Integer x) {
        int slot;
        for (int i = 0; i < table.length; i++) {
            slot = hash(i, x);
            if (table[slot] == null) {
                return NOT_FOUND;
            } else if (table[slot].compareTo(x) == 0) {
                return table[slot]; // Found at table[slot]
            }
        }
        return NOT_FOUND;
    }

    public void insert(Integer x) {
        int slot;
        if (numItems == table.length) { /* 에러 처리 */
        } else {
            for (int i = 0; i < table.length; i++) {
                slot = hash(i, x);
                if (table[slot] == null || table[slot] == DELETED) {
                    table[slot] = x;
                    numItems++;
                    break;
                }
            }
        }
    }

    public void delete(Integer x) {
        int slot;
        for (int i = 0; i < table.length; i++) {
            slot = hash(i, x);
            if (table[slot] == null) {
                break; // 필요시 에러 처리
            } else if (table[slot].compareTo(x) == 0) {
                table[slot] = DELETED;
                numItems--;
                break;
            }
        }
        // x가 존재하지 않으면
        // 아무 영향도 미치지 않고 끝난다.
        // 필요에 따라 다른 방식으로
        // 처리할 수도 있다.
    }
    // isEmpty() and clear() are trivial

}