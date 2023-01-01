package Lesson_4_26_12_22;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number...");
        number = input.nextInt();

        if (number % 2 ==0){
            System.out.println("Число " + number + " чётное.");
        }
        else{
            System.out.println("Число " + number + " нечётное.");
        }
    }
}



