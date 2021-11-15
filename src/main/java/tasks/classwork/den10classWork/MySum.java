package tasks.classwork.den10classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySum {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама мыла раму мама чисто");

        System.out.println(list.stream().flatMap(m -> Arrays.stream(m.split(""))).count());

        list.stream().collect(Collectors.joining(":", "<p>", "</p>"));

    }
}
