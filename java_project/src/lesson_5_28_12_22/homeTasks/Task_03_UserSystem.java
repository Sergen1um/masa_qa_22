package lesson_5_28_12_22.homeTasks;

import java.util.Scanner;

public class Task_03_UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";
        int attempt = 1;

        System.out.println("Enter your login: ");
        Scanner input = new Scanner(System.in);
        String enteredId = input.nextLine();

        while (!enteredId.equals(username) && attempt < 5) {
            System.out.println("There is no user with such name! Attempts left: " + (5 - attempt) + ".");
            System.out.println("Enter your login: ");
            enteredId = input.nextLine();
            attempt++;
        }
        if (!enteredId.equals(username)) {
            System.out.println("Too many attempts, please try again later.");
            input.close();
        } else {
            System.out.println("Enter your password: ");
            String enteredPass = input.nextLine();
            attempt = 1;
            while (!enteredPass.equals(password) && attempt < 5) {
                System.out.println("You have entered an incorrect password! Attempts left: " + (5 - attempt) + ".");
                System.out.println("Enter your password: ");
                enteredPass = input.nextLine();
                attempt++;
            }
            if (!enteredPass.equals(password)) {
                System.out.println("Too many attempts, please try again later.");
                input.close();
            } else {
                System.out.println("Hello " + username + " ,you are logged in.");
            }
        }
        input.close();
    }
}

