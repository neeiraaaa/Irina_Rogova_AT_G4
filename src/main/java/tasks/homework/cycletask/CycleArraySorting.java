package tasks.homework.cycletask;

import java.util.Arrays;
import java.util.Random;

public class CycleArraySorting {

    public int[] randomArray() {

        int[] myFirstArray = new CycleArray().randomArray();

        //System.out.println(Arrays.toString(myFirstArray));

        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < myFirstArray.length - 1; i++) {
                if (myFirstArray[i] < myFirstArray[i + 1]) {
                    int temp = myFirstArray[i];
                    myFirstArray[i] = myFirstArray[i + 1];
                    myFirstArray[i + 1] = temp;
                }else {
                    isSorted = true;
                }
            }
            System.out.println(Arrays.toString(myFirstArray));
        }
        return myFirstArray;
        }
    }

