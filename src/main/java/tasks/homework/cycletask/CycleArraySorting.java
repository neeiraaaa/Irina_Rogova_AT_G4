package tasks.homework.cycletask;

import java.util.Arrays;
import java.util.Random;

public class CycleArraySorting extends CycleArray {
    public int[] randomArray() {

        int[] myFirstArray = new CycleArray().randomArray();

        System.out.println(Arrays.toString(myFirstArray));

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
        }
        for (int i = 0; i < myFirstArray.length - 1; i++) {
            if (myFirstArray[i] < myFirstArray[i + 1]) {
                int temp = myFirstArray[i];
                myFirstArray[i] = myFirstArray[i + 1];
                myFirstArray[i + 1] = temp;
                isSorted = false;
            }
            System.out.println(Arrays.toString(myFirstArray));
        }
        return myFirstArray;
        }
    }

