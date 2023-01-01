package Lesson_4_26_12_22;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number (1-3): ");

        //int number = input.nextInt();
        String text = input.nextLine();

        switch (text){
            //case 1:
            case "1":
                System.out.println("Number is 1");
                break;
            //case 2:
            case "2":
                System.out.println("Number is 2");
                break;
            //case 3:
            case "3":
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Wrong number...");
                break;
        }

        input.close();
    }
}
