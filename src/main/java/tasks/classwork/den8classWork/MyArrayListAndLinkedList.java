package tasks.classwork.den8classWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListAndLinkedList {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t1 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add("mama");
        }
        System.out.println("ArrayList = " + (System.currentTimeMillis() - t1));

        long t2 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("papa");
        }
        System.out.println("LinkedList = " + (System.currentTimeMillis() - t2));


    }
}
