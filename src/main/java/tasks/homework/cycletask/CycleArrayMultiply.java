package tasks.homework.cycletask;

import java.util.Random;

public class CycleArrayMultiply extends CycleArray {
    public void randomArray() {

        int multiply = 5;

        int[] myFirstArray = new int[7];
        Random random = new Random();

        for (int i = 0; i < myFirstArray.length; i++) {

            myFirstArray[i] = random.nextInt(100);
            System.out.print(myFirstArray[i] * multiply + " ");  //каждый элемент массива умножить на 5 и вывести результат в консоль
        }
    }
}
