package lesson_5_28_12_22.loops;

import java.util.Scanner;

public class MonthsWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number 1 - 3: ");
        int monthNumber = input.nextInt();

        while (monthNumber != 1 && monthNumber != 3 && monthNumber != 6){
            System.out.println("Wrong choice!!!");
            System.out.println("Enter your number 1 - 3: ");
            monthNumber = input.nextInt();
        }

        switch (monthNumber){
            case 1:
                System.out.println(1);
                break;
            case 3:
                System.out.println(1);
                break;
            case 6:
                System.out.println(1);
                break;
        }
    }
}
