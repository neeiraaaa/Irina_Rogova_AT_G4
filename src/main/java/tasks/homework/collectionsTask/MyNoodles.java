package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyNoodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodles1 : noodles) {
            System.out.print(noodles1 + "-");
        }

        System.out.println();

        //Заменить в каждом слове буквы "а" на букву "о"
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i).replaceAll("[a]", "o") + " ");
        }
    }
}
