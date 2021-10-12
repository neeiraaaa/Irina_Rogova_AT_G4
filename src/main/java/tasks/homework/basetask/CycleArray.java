package tasks.homework.basetask;

import java.util.Random;

public class CycleArray {

    public int[] randomArray() {

        int[] myFirstArray = new int[7];
        Random random = new Random();

        for (int i = 0; i < myFirstArray.length; i++) {

            myFirstArray[i] = random.nextInt(100);
        }
        return myFirstArray;
    }
}
