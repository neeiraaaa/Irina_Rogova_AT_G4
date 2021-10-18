package tasks.homework.arraysAndConsole;

 //написать метод, который подсчитает сумму каждого n-ого элемента в целочисленном массиве, где n - целое число,
// передаваемое в сигнатуру этого метода

public class ArraySumN {

    public void AddN(int number) {
        int[] numberArray = new int[100];

        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            sum = sum + numberArray[number];
            number = number + number;
            if (number > numberArray.length) {
                break;

            }
            System.out.println(number);
        }
    }
}