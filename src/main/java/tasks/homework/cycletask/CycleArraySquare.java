package tasks.homework.cycletask;

import java.util.Random;

public class CycleArraySquare extends CycleArray {

    public int[] randomArray() {

        int[] myFirstArray = new CycleArray().randomArray();
        Random random = new Random();

        for (int i = 0; i < myFirstArray.length; i++) {

            myFirstArray[i] = random.nextInt(100);
            myFirstArray[i] = (int) Math.pow(myFirstArray[i], 2);
            System.out.println(myFirstArray[i] + " ");  //каждый элемент массива возвести в квадрат и вывести результат в консоль
        }
        return myFirstArray;
    }
}
