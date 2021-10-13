package tasks.homework.cycletask;

import java.util.Random;

public class CycleArrayMin extends CycleArray {

    public int[] randomArray() {

        int[] myFirstArray = new CycleArrayMin().randomArray();
        Random random = new Random();
        int min = myFirstArray[0];

        for (int i = 1; i < myFirstArray.length; i++) {

            myFirstArray[i] = random.nextInt(100);

            if (myFirstArray[i] < min) {
                min = myFirstArray[i];
            }
            System.out.println(min);  //найти минимальный элемент массива и вывести результат в консоль

        }
        return myFirstArray;
    }
}
