package Lesson_4_26_12_22;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age...");
        int age = input.nextInt();

        if (age == 18) {
            System.out.println("You're 18 years old");
        }
        else if (age > 18) {
            System.out.println("You're adult");
        }
        else {
            System.out.println("You're young");
        }
    }
}
