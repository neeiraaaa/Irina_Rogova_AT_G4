package tasks.classwork.den8classWork;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < array.length ; i++) {
            hashMap.put(i, array[i]);
        }

        for (int x : hashMap.keySet()) {
            System.out.println(x);
        }

        for (String g : hashMap.values()) {
            System.out.println(g);
        }

        for (Map.Entry<Integer, String> k : hashMap.entrySet()) {
            System.out.println(k);
        }
    }
}
