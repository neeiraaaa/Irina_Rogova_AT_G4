package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFigures {

    public static void main(String[] args) {

        List<String> figures  = new ArrayList<String>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        for (String myFigures : figures) {
            System.out.print( myFigures + " " + "-" + " ");
        }

        System.out.println(" ");

        int counter = 0;

        for (String myFigures1 : figures) {
            if (!myFigures1.contains("и")) {
                counter++;
            }
        }
        System.out.println(" ");
        System.out.println(counter);

        System.out.println(" ");

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        figures.add(3,"Треугольник");

        for (String myFigures2 : figures) {
            System.out.print(myFigures2 + " ");
        }

    }
}
