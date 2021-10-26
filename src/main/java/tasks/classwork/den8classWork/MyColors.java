package tasks.classwork.den8classWork;

import java.util.ArrayList;
import java.util.List;

public class MyColors {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

            colors.add("Red");
            colors.add("Green");
            colors.add("Orange");
            colors.add("White");
            colors.add("Black");

        for (String m : colors) {
            System.out.print(m + " ");
        }

            colors.add(2, "Pink");
            colors.add(4, "Yellow");

        System.out.println(" ");

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }

        System.out.println(" ");

        System.out.print(colors.get(1) + " " + colors.get(5));

    }
}
