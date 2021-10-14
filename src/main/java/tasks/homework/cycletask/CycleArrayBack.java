package tasks.homework.cycletask;

import java.util.Random;

public class CycleArrayBack extends CycleArray {
    public int[] randomArray() {

        int[] myFirstArray = new CycleArray().randomArray();

        Random random = new Random();

        for (int i = myFirstArray.length-1; i >= 0; i--) {

            myFirstArray[i] = random.nextInt(100);
            System.out.print(myFirstArray[i] + " ");  //вывести в консоль все элементы массива в обратном порядке
        }
        return myFirstArray;
    }
}
