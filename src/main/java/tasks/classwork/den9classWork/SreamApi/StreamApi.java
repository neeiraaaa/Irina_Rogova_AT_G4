package tasks.classwork.den9classWork.SreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

       long count = list.stream().filter("мама"::equalsIgnoreCase).count();
        System.out.println(count);

        //вернуть первый элемент или "мама", если коллекция пуста
       String newList =  list.stream().findFirst().orElse("мама");

        //вернуть первый элемент равный - мама
        String newList2 = list.stream().filter("мама"::equals).findFirst().get();

        //вернуть пятый элемент коллекции по порядку
        String newList3 = list.stream().skip(4).findFirst().get();

        //вернуть массив из двух эллементов, начиная с третьего
        String[] newList4 = (String[]) list.stream().skip(2).limit(2).toArray();

        //выбрать коллекцию из уникальных строк, содержащих - м
        List<String> newList5 = list.stream().distinct().filter(m -> m.contains("m")).collect(Collectors.toList());

    }
}
