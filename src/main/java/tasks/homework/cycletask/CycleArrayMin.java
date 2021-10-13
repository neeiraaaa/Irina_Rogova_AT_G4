package tasks.homework.cycletask;

import java.util.Random;

public class CycleArrayMin {

    public void randomArray() {

        int[] myFirstArray = new CycleArray().randomArray();

        int min = myFirstArray[0];

        for (int i = 1; i < myFirstArray.length; i++) {

            if (myFirstArray[i] < min) {
                min = myFirstArray[i];
            }
            System.out.println(min);  //найти минимальный элемент массива и вывести результат в консоль

        }
    }
}
