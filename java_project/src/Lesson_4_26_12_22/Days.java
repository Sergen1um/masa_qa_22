package Lesson_4_26_12_22;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your day (1-7): ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number of a day");
                break;
        }

        input.close();
    }
}
