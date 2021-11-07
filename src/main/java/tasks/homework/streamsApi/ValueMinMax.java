package tasks.homework.streamsApi;

//сгенерировать List коллекцию целых чисел из n элементов от
// minValue до maxValue и определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream

import java.util.ArrayList;

public class ValueMinMax {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList(); // Создание коллекции

        for (int i = 0; i < 100; i++) { // Заполнение коллекции последовательностью чисел от 0 до 100
            list.add(i);
        }
        boolean neqList = list.stream().anyMatch((i -> (i % 3 == 0 ) && (i % 5 == 0)));
        System.out.println(neqList);
    }
}
