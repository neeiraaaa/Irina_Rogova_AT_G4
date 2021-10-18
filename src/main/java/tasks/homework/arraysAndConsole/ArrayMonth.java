package tasks.homework.arraysAndConsole;

//написать метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего месяца

import java.time.LocalDate;

public class ArrayMonth {

    public int sumMonth() {

        int sum = 0;
        int[] newArray = new int[100];
        LocalDate localDate = LocalDate.now();

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % localDate.getMonthValue() == 0) {
                sum = sum + newArray[i];
            }
        }
        return sum;
    }
}

