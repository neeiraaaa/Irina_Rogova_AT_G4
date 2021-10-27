package tasks.homework.collectionsTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyCars {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        for (String myCars : cars) {
            System.out.println("\"" + myCars + "\"" + " ");
        }

        System.out.println(" ");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 4) {
                iterator.remove();
            }
        }
        System.out.println(cars);
    }
}
