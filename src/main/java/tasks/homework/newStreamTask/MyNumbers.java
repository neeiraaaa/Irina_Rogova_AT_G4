package tasks.homework.newStreamTask;

/*Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
Проитерировать список через for-each и отпечатать числа в консоль новой строки
Посчитать сумму всех чисел и вывести результат в консоль
Отсортировать список по возрастанию
 Проитерировать список по индексу и отпечатать числа в консоль через пробел
Развернуть список в обратном порядке
Проитерировать список через for-each и отпечатать числа в консоль через пробел*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyNumbers {

    public static void main(String[] args) {

        List<Integer> myNumbers  = new ArrayList<Integer>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));

        myNumbers.forEach(System.out::println); //проитерировать список в консоль с новой строки
        System.out.println(myNumbers.stream().reduce(Integer::sum).orElse(0)); //Посчитать сумму всех чисел и вывести результат в консоль
        myNumbers.stream().sorted().forEach(System.out::println); //Отсортировать список по возрастанию
        System.out.println(myNumbers.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList())); //Развернуть список в обратном порядке
    }
}
