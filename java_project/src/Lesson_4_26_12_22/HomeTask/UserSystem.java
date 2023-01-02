package Lesson_4_26_12_22.HomeTask;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";

        System.out.println("Enter your login: ");

        Scanner input = new Scanner(System.in);
        String enteredId = input.nextLine();

        if (enteredId.equals(username)) {
            System.out.println("Enter your password: ");
            String enteredPass = input.nextLine();

            if (enteredPass.equals(password)) {
                System.out.println("Hello " + username + " ,you are logged in." );
            }
            else {
                System.out.println("You have entered an incorrect password!");
            }
        }
        else {
            System.out.println("There is no user with such name!");
        }
    }
}
