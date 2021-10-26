package tasks.classwork.den8classWork;

import java.util.ArrayList;
import java.util.List;

public class MyNames {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String m : names) {
            System.out.print(m + " ");
        }

        names.set(2, "Оля");
        names.set(4, "Катя");

        System.out.println(" ");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        names.remove("Оля");
        names.remove(3);

        System.out.println(" ");

        for (String j: names) {
            System.out.print(j + " ");
        }

    }
}
