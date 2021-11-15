package tasks.classwork.den10classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyNextClass {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().sorted().collect(Collectors.toList());
        System.out.println(list.stream().sorted((o1, o2) -> -o1.compareTo(o2)).distinct().collect(Collectors.toList()));

    }
}
