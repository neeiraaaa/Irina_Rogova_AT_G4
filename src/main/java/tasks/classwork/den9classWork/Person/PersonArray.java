package tasks.classwork.den9classWork.Person;

import java.util.Arrays;
import java.util.List;

public class PersonArray {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counter = 0;
        for (Person person : people) {
            if (((person.getAge() < 60 && person.getSex().equals(Person.Sex.MAN)) ||
                    (person.getAge() < 55 && person.getSex().equals(Person.Sex.WOMEN))) && (person.getAge() > 18))
                counter++;
        }
        System.out.println(counter);

        long peopleNew = people.stream().filter(person -> person.getAge() > 18).
                filter(person -> (((person.getAge() < 60 && person.getSex().equals(Person.Sex.MAN)) ||
                        (person.getAge() < 55 && person.getSex().equals(Person.Sex.WOMEN))))).count();

        System.out.println(peopleNew);
    }
}
