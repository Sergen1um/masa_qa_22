package lesson_8_09_01_23.classTasks;

import java.util.Random;
import java.util.Scanner;

public class Task_02_IsNumberExistsCopy_mySolution {
    public static void main(String[] args) {

        Random number = new Random();
        Scanner input = new Scanner(System.in);

        int array[] = new int[10];
        int myValley = -1;

        for (int i = 0; i < array.length; i++) {

            array[i] = number.nextInt(10);
            System.out.print(array[i] + " ");

        }

        while (!checkValue(myValley, array)) {

            System.out.println("\nEnter your number from 0 to 10 : ");
            myValley = input.nextInt();

            System.out.println(checkValue(myValley, array));

        }

        input.close();

    }

    public static boolean checkValue(int myValue, int[] array) {

        for (int i : array) {

            if (myValue == i) {

                return true;

            }
        }

        return false;

    }
}

