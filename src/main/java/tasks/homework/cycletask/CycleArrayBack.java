package tasks.homework.cycletask;

import java.util.Random;

public class CycleArrayBack extends CycleArray {
    public void randomArray() {

        int[] myFirstArray = new int[7];
        Random random = new Random();

        for (int i = myFirstArray.length-1; i >= 0; i--) {

            myFirstArray[i] = random.nextInt(100);
            System.out.println(myFirstArray[i] + " ");  //вывести в консоль все элементы массива в обратном порядке
        }
    }
}
