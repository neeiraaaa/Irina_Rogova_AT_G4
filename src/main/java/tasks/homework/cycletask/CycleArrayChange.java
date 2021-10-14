package tasks.homework.cycletask;

import java.util.Arrays;
import java.util.Random;

//поменять местами первый и последний элементы и вывести результат в консоль

public class CycleArrayChange extends CycleArray {
    public int[] randomArray() {

        int[] myFirstArray = new CycleArray().randomArray();
        int max = myFirstArray[0];
        int min = myFirstArray[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < myFirstArray.length; i++) {
            if (max > myFirstArray[i]) { // сравниваем 
                maxInd = i; // запоминаем индекс
                max = myFirstArray[i]; // запоминаем значение
            }
            if (min < myFirstArray[i]) { // сравниваем
                minInd = i; // запоминаем индекс
                min = myFirstArray[i]; // запоминаем значение
            }
        }
        // переставляем элементы
        int temp = myFirstArray[minInd];
        myFirstArray[minInd] = myFirstArray[maxInd];
        myFirstArray[maxInd] = temp;
        Arrays.stream(myFirstArray).forEach(e -> System.out.println(e)); // вывод массива
        return myFirstArray;
        }
    }
