package tasks.homework.newStreamTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) через (Sets.newHashSet())
Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
Найти и удалить из набора авто, в названии которых больше 4 букв
Проитерировать список через for-each и отпечатать слова в консоль через пробел*/

    public class MyCars {

        public static void main(String[] args) {

            Set<String> cars = new HashSet<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

            for (String myCars : cars) {
                System.out.println("\"" + myCars + "\"" + " ");
            }

            System.out.println(" ");

            cars.removeIf(s -> s.length() > 4);
            System.out.println(cars);
        }
    }

