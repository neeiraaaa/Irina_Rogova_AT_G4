package tasks.stringTask;

//найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в консоль

import java.util.Arrays;

public class NewNumbers {

    public static void main(String[] args) {

        String textMixString = "Привет Ира 1, привет Настя 2, привет Оля 3";

        String[] parts = textMixString.split("\\D");
        for (String x : parts) {
            if (!x.equals("")) {
                System.out.println(x);
            }
        }
    }
}


