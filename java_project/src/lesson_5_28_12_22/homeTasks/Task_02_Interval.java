package lesson_5_28_12_22.homeTasks;

import java.util.Scanner;

public class Task_02_Interval {
    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number < 0 || number > 100) {

            System.out.println("Your number " + number + " is not in one of the interval. Enter new number 0 - 100: ");
            number = input.nextInt();
        }
        if (number >= 0 && number <= 14) {
            System.out.println("Your number " + number + " in interval 0-14");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Your number " + number + " in interval 15-35");
        } else if (number >= 36 && number < 50) {
            System.out.println("Your number " + number + " in interval 36-50");
        } else if (number == 50) {
            System.out.println("Your number " + number + " in intervals 36-50 and 50-100");
        } else if (number > 50 && number <= 100) {
            System.out.println("Your number " + number + " in interval 50-100");
        }
        input.close();
    }
}
//        int number = 0;
//
//        do {
//        System.out.println("Enter your number: ");
//        Scanner input = new Scanner(System.in);
//        number = input.nextInt();
//            if (number >= 0 && number <= 14) {
//                System.out.println("Your number " + number + " in interval 0-14");
//            } else if (number >= 15 && number <= 35) {
//                System.out.println("Your number " + number + " in interval 15-35");
//            } else if (number >= 36 && number < 50) {
//                System.out.println("Your number " + number + " in interval 36-50");
//            } else if (number == 50) {
//                System.out.println("Your number " + number + " in interval 36-100");
//            } else if (number > 50 && number <= 100) {
//                System.out.println("Your number " + number + " in interval 50-100");
//            } else {
//                System.out.println("Your number " + number + " is not in one of the interval");
//            }
//            }
//                while (number < 0 || number > 100);

