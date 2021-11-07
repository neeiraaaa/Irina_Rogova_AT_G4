package tasks.homework.streamsApi;

 //Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
// Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21,
// выводит их имена и возраст в консоль, сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator),
// берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonRunner {

    public static void main(String[] args) {

        List<String> person = IntStream.rangeClosed(1, 100).boxed() .map(i -> new Person("Name" + i, "Surname" + i, ThreadLocalRandom.current()
                .nextInt(15,30) ))
                .filter(p -> p.getAge() < 21)
                .peek(people -> System.out.println(people.getName() + " " + people.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(person);
    }
}
