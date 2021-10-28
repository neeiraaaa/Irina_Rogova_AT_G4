package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyElements {

    public static void main(String[] args) {

        List<String> elementsNew = new ArrayList<>();

        elementsNew.add("Text field");
        elementsNew.add("Radio");
        elementsNew.add("Check-box");
        elementsNew.add("Drop-down");
        elementsNew.add("Picker");
        elementsNew.add("Breadcrumb");

        for (String elements : elementsNew) {
            System.out.print(elements + " ");
        }

        System.out.println();
        System.out.println();

        //Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        String words2regex = ".+\\W+.+";
        int countMore1Word = 0;
        for (String w : elementsNew) {
            if (w.matches(words2regex)) {
                countMore1Word++;
            }
        }
        System.out.println(countMore1Word);

        for (int i = 0; i < elementsNew.size(); i++) {
            System.out.print(elementsNew.get(i) + " ");
        }
        System.out.println();

        elementsNew.add(4, "Spinner");
        elementsNew.remove(2);
        elementsNew.remove(5);
        elementsNew.add(5,"Switch");

        for (String elements2 : elementsNew) {
            System.out.print(elements2 + " ");
        }
    }
}
