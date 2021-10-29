package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBirds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<String>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String birds1 : birds) {
            System.out.println("--" + birds1 + " " + "--" + " ");
        }

        //Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        int count = 0;
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
            String newBirds = bird.replaceAll("[аеёиоуыэюя]", "");
            if ((bird.length() - newBirds.length()) > 1) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        System.out.println();
        System.out.println();

        birds.remove(3);
        birds.add(3,"Синица");

        for (String birds2 : birds) {
            System.out.print(birds2 + " " );
        }
    }
}


