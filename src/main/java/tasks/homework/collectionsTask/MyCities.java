package tasks.homework.collectionsTask;

import java.util.ArrayList;
import java.util.List;

public class MyCities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String citi : cities) {
            System.out.println(citi);
        }

        int count = 0;

        for (String city : cities) {
            count += city.length();
        }
        System.out.println("Сумма всех букв: " + count);


        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}

