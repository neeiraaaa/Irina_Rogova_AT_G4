package tasks.classwork.den8classWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        String myString = "мама мыла раму";
        String[] arraysString = myString.split(" ");

        for (String x : arraysString) {
            mySet.add(x);
        }

        for (String m : mySet) {
            System.out.println(m);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
