package tasks.homework.arraysAndConsole;

 //написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного
// массива, которые больше, чем число n, где n - целое число, передаваемое в сигнатуру этого метода,
// элементы в результирующем массиве должны быть расположены в обратном порядке

public class ArrayBack {

    public int[] returnArray(int numberN) {

        int[] newFirstArray = new int[100];
        int secondArrayLength = 0;

        for (int i = 0; i < newFirstArray.length; i++) {
            if (newFirstArray[i] > numberN) {
                secondArrayLength++;
            }
        }

        int[] secondArray = new int[secondArrayLength];


        for (int i = 0; i < newFirstArray.length; i++) {
            if (newFirstArray[i] > numberN) {
                secondArray[secondArrayLength - 1] = newFirstArray[i];
                secondArrayLength--;
                if (secondArrayLength == 0) {
                    break;
                }
            }
        }
        return secondArray;
    }
}
