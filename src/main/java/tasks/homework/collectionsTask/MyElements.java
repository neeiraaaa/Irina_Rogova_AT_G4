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

        //Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль


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
