package tasks.classwork.den10classWork;

import tasks.classwork.den9classWork.Person.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonNew {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new tasks.classwork.den9classWork.Person.Person("Вася", 13, Person.Sex.MAN),
                new tasks.classwork.den9classWork.Person.Person("Катя", 28, Person.Sex.WOMEN),
                new tasks.classwork.den9classWork.Person.Person("Вова", 24, Person.Sex.MAN),
                new tasks.classwork.den9classWork.Person.Person("Маша", 38, Person.Sex.WOMEN),
                new tasks.classwork.den9classWork.Person.Person("Роман Петрович", 72, Person.Sex.MAN));

        people.stream().sorted((x,y) -> {
            if (x.getSex() != y.getSex()) {
                return x.getSex().compareTo(y.getSex());
            } else { return x.getAge() - y.getAge();
            }
        }).peek(p -> System.out.println(p.getName())).collect(Collectors.toList());


        people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p));

        people.stream().collect(Collectors.groupingBy(p -> p.getSex())).keySet().forEach(System.out::println);
    }
}
