package tasks.classwork.den10classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMamaStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch(m -> m.equals("мама")));

        System.out.println(list.stream().allMatch(m -> m.contains("м")));

        System.out.println(list.stream().map(m -> m + "м").collect(Collectors.toList()));

        System.out.println(list.stream().flatMap(m -> Arrays.stream(m.split("а"))).filter(s -> !s.equals("")).collect(Collectors.toList()));
    }
}
