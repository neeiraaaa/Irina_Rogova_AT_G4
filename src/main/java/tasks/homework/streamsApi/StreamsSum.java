package tasks.homework.streamsApi;

//для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму

import java.util.stream.IntStream;

public class StreamsSum {

    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(1, 20).boxed().filter(number -> number % 2 == 0).mapToDouble(number -> number * 2.54).sum());
    }
}
