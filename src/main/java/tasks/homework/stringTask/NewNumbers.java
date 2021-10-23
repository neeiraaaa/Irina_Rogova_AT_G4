package tasks.homework.stringTask;

//найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в консоль

public class NewNumbers {

    public static void main(String[] args) {

        String textMixString = "Привет Ира 1, привет Настя 2, привет Оля 3";


        int counter = 0;

        String[] parts = textMixString.split("\\D");
        for (String x : parts) {
            if (!x.equals("")) {
                counter++;
               // System.out.println(x);
            }
        }
        int[] out = new int [counter];

        for (String x : parts) {
            if (!x.equals("")) {
                out[counter-- -1] = Integer.parseInt((x));
            }
        }

        for (int x : out) {
            System.out.println(x);
        }
    }
}


