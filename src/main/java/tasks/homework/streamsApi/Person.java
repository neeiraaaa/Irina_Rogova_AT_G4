package tasks.homework.streamsApi;

//создать класс Person, с полями name, surname, age. Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
// Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21,
// выводит их имена и возраст в консоль, сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator),
// берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию

public class Person {

    private int age;
    private String name;
    private String surname;

}
