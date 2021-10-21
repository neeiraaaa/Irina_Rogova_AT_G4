package tasks.stringTask;

//найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в консоль

import java.util.Arrays;

public class NewNumbers {

    public static void main(String[] args) {

        String textMixString= "Привет Ира 1, привет Настя 2, привет Оля 3";

        for(int i=0; i<textMixString.length(); i++)
        {
            //Метод Character.isDigit() — определяет, является ли указанное значение типа char цифрой.
            //Метод charAt() — возвращает символ, расположенный по указанному индексу строки.
            if(Character.isDigit(textMixString.charAt(i)))
                System.out.print(textMixString.charAt(i) + "  ");


            int[] array = new int[i];
            System.out.println(Arrays.toString(array));
        }
    }
}
