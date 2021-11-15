package tasks.classwork.den10classWork;

import tasks.classwork.den9classWork.Person.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SplitStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама мыла раму мама чисто");

        list.stream().flatMap(m -> Arrays.stream(m.split("")).peek(System.out::println)).max(String::compareTo).get();

        List<tasks.classwork.den9classWork.Person.Person> people = Arrays.asList(
                new tasks.classwork.den9classWork.Person.Person("Вася", 13, tasks.classwork.den9classWork.Person.Person.Sex.MAN),
                new tasks.classwork.den9classWork.Person.Person("Катя", 28, tasks.classwork.den9classWork.Person.Person.Sex.WOMEN),
                new tasks.classwork.den9classWork.Person.Person("Вова", 24, tasks.classwork.den9classWork.Person.Person.Sex.MAN),
                new tasks.classwork.den9classWork.Person.Person("Маша", 38, tasks.classwork.den9classWork.Person.Person.Sex.WOMEN),
                new tasks.classwork.den9classWork.Person.Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(people.stream().min(Comparator.comparingInt(Person::getAge)).get());
    }
}
