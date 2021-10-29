package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyDoubles {

    public static void main(String[] args) {

        List<Double> myDoubles = new ArrayList<Double>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (double doubles : myDoubles) {
            System.out.print(doubles + " ");
        }
        System.out.println();
        System.out.println();

        //Посчитать произведение всех чисел и вывести результат в консоль
        double multiply = 1;
        for (int i = 0; i < myDoubles.size(); i++) {
            multiply *= myDoubles.get(i);
        }
        System.out.println(multiply);

        System.out.println();
        System.out.println();

        //найти сумму всех дробных частей и вывести результат в консоль
        double mod = 0;
        for (int i = 0; i < myDoubles.size(); i++) {
            mod += myDoubles.get(i) % 1;
        }
        System.out.println(mod);

        //Проитерировать список по индексу и целые части в консоль через пробел
        for (int i = 0; i < myDoubles.size(); i++) {
            System.out.print(Double.valueOf(myDoubles.get(i)).intValue() + " ");

        }
    }
}

