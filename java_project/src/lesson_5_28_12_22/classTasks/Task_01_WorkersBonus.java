package lesson_5_28_12_22.classTasks;

import java.util.Locale;
import java.util.Scanner;

public class Task_01_WorkersBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        if (salary > 0) {

        System.out.println("Enter your work experience");
        double experience = input.nextDouble();

            if (experience > 0 && experience < 5) {
                System.out.println("Premium amount: " + salary * 0.10);
                System.out.println("New salary: " + (salary + salary * 0.10));
            }
            else if (experience >= 5 && experience < 10) {
                System.out.println("Premium amount: " + salary * 0.15);
                System.out.println("New salary: " + (salary + salary * 0.15));
            }
            else if (experience >= 10 && experience < 15) {
                System.out.println("Premium amount: " + salary * 0.25);
                System.out.println("New salary: " + (salary + (salary * 0.25)));
            }
            else if (experience >= 15 && experience < 20) {
                System.out.println("Premium amount: " + salary * 0.35);
                System.out.println("New salary: " + (salary + (salary * 0.35)));
            }
            else if (experience >= 20 && experience < 25) {
                System.out.println("Premium amount: " + salary * 0.45);
                System.out.println("New salary: " + (salary + (salary * 0.45)));
            }
            else if (experience >= 25) {
                System.out.println("Premium amount: " + salary * 0.50);
                System.out.println("New salary: " + (salary + (salary * 0.50)));
            } else {
                System.out.println("Incorrect data!");
            }
        }
        else {
            System.out.println("Incorrect data!");
        }
        input.close();
        }
    }
