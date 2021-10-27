package tasks.homework.collectionsTask;

import java.util.*;

public class MyNumbers {

    public static void main(String[] args) {

        List<Integer> myNumbers  = new ArrayList<Integer>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));

        for (Integer numbers : myNumbers) {
            System.out.println(numbers);
        }

        System.out.println();
        System.out.println();

        int sum = 0;
        for (int i = 0; i < myNumbers.size(); i++) {
            sum = sum + myNumbers.get(i);
        }
        System.out.println(sum);

        System.out.println();
        System.out.println();

        //Отсортировать список по возрастанию
        Collections.sort(myNumbers);
        for(int counter: myNumbers){
            System.out.print(counter + " ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.print(myNumbers.get(i) + " ");
        }

        System.out.println();
        System.out.println();

        //Развернуть список в обратном порядке
        Collections.sort(myNumbers, Collections.reverseOrder());
        for(int counter2 : myNumbers){
            System.out.println(counter2);
        }

        System.out.println();
        System.out.println();

        for (Integer numbers3 : myNumbers) {
            System.out.print(numbers3 + " ");
        }
    }
}

