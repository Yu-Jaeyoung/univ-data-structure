package collection.framework.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(final String[] args) {
        // ArrayList 컬렉션 객체 생성
        final List<String> arrayList = new ArrayList<String>();

        // LinkedList 컬렉션 객체 생성
        final List<String> linkedList = new LinkedList<String>();

        // 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            arrayList.add(0, String.valueOf(i));
            arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList  걸린 시간: ", (endTime - startTime));

        // LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            linkedList.add(0, String.valueOf(i));
            linkedList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime));
    }
}