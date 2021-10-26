package tasks.classwork.den8classWork;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        String myString = "Мама мыла раму";
        String[] arraysString = myString.split(" ");

        for (String x : arraysString) {
            myList.add(x);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String m : myList) {
            System.out.println(m);
        }

    }
}
