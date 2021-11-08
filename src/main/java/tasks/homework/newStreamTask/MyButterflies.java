package tasks.homework.newStreamTask;

/*Создать пустой список стрингов butterflies (через new ArrayList)
Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
Проитерировать список через for-each и отпечатать слова в консоль в кавычках
Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
Проитерировать список по индексу и отпечатать слова в консоль через пробел
Проитерировать список через for-each и отпечатать слова в консоль через перенос строки*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyButterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        System.out.println(butterflies.stream().filter(s -> s.contains("o")).count()); //Посчитать сколько бабочек содержат букву "о" и вывести число в консоль


    }
}
