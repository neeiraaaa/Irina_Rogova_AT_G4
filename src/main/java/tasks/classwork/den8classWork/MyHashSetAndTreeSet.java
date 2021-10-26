package tasks.classwork.den8classWork;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashSetAndTreeSet {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        long t1 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            hashSet.add("mama ");
        }
        System.out.println("hashSet = " + (System.currentTimeMillis() - t1));

        long t2 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            treeSet.add("papa ");
        }
        System.out.println("treeSet = " + (System.currentTimeMillis() - t2));

        long t3 = System.currentTimeMillis();

        for(String h1 : hashSet) {
            System.out.println(h1 + "HashSetReed = " + (System.currentTimeMillis() - t3));
        }

        long t4 = System.currentTimeMillis();

        for(String h2 : treeSet) {
            System.out.println(h2 + "TreeSetReed = " + (System.currentTimeMillis() - t4));
        }

    }
}
