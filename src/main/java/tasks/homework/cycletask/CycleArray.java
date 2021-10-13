package tasks.homework.cycletask;

import java.util.Random;

public class CycleArray {

    public int[] randomArray() {

        int[] myFirstArray = new int[7];
        Random random = new Random();

        for (int i = 0; i < myFirstArray.length; i++) {

            myFirstArray[i] = random.nextInt(100);
            System.out.print(myFirstArray[i] + " ");  //пройти по массиву и вывести в консоль все элементы
        }
        return myFirstArray;
    }
}
