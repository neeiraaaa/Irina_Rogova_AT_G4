package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.List;

public class MyButterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String myButterflies : butterflies) {
            System.out.println("\"" + myButterflies + "\"" + " ");
        }

        int counter = 0;

        for (String myButterflies2 : butterflies) {
            if (myButterflies2.contains("o")) {
                counter++;
            }
        }
        System.out.println(" ");
        System.out.println(counter);

        System.out.println(" ");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        for (String myButterflies3 : butterflies) {
            System.out.print(myButterflies3 + "\n");
        }

    }
}
