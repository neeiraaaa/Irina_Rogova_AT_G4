package src.den2classwork;

import java.util.Random;

public class ForEachDemo {

    public void goForEachDemo() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(100);
        }
        for (int i : array) {

        }
        int sum = 0;
        for (int i : array) {
            sum = sum + i;

        }
        System.out.println();
        System.out.println(sum / array.length);
    }

}

