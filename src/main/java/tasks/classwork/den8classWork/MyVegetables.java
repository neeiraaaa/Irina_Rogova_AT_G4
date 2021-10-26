package tasks.classwork.den8classWork;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String m : vegetables) {
            System.out.print(m + " ");
        }

        int counter = 0;

        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                counter++;
            }
        }
        System.out.println(" ");
        System.out.println(counter);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }

        vegetables.remove("Огурец");
        vegetables.remove(3);

        System.out.println(" ");

        for (String j: vegetables) {
            System.out.print(j + " ");
        }
    }
}
