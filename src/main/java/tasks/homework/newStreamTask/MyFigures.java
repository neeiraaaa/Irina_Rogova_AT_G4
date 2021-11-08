package tasks.homework.newStreamTask;

/*Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
Проитерировать список через for-each и отпечатать слова в в файл figures через тире
Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
Проитерировать список по индексу и отпечатать слова в консоль через пробел
Вставить на 3 позицию Треугольник
Проитерировать список через for-each и отпечатать слова в консоль через пробел*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFigures {

    public static void main(String[] args) {

        List<String> figures  = new ArrayList<String>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        System.out.println(figures.stream().filter(s -> !s.contains("и")).count()); //Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
    }
}
