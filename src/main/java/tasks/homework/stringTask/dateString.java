package tasks.homework.stringTask;

//написать метод, который выводит в консоль текущую дату и время в формате:
//Сейчас на дворе: 19 сентября, 2020, 3 часа 13 минут

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateString {

    public static void main(String[] args) {

        // получить текущую дату и время
        Date now = new Date();

        SimpleDateFormat format = new SimpleDateFormat("d сентября, yyyy, k часа m минут");
        System.out.println("Сейчас на дворе: " + format.format(now));
    }
}
