package tasks.homework.scanerCalc;

import java.util.Scanner;

public class MyCalcScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;
        int division = 0, addition = 0, subtraction = 0, multiplication = 0;
        String userChoice = "";

        //ask for user input
        System.out.print("Please enter first number: ");
        firstNum = input.nextInt();
        System.out.print("Please enter second number: ");
        secondNum = input.nextInt();
        System.out.println("What type of operation would you like to perform on these numbers?");
        System.out.println("add " + "multiply " + "subtract " + "divide ");

        addition = firstNum + secondNum;
        multiplication = firstNum * secondNum;
        subtraction = firstNum - secondNum;
        division = firstNum / secondNum;

        while (input.hasNext()) {
           userChoice = input.nextLine();

            if (userChoice.equals("add")) {
                System.out.println("Answer = " + addition);
                break;
            }

            if (userChoice.equals("multiply")) {
                System.out.println("Answer = " + multiplication);
                break;
            }

            if (userChoice.equals("divide")) {
                System.out.println("Answer = " + division);
                break;
            }

            if (userChoice.equals("subtract")) {
                System.out.println("Answer = " + subtraction);
                break;
            }
        }
    }
}

