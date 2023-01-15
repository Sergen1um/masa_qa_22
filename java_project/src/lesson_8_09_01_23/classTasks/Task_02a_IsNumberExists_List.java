package lesson_8_09_01_23.classTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02a_IsNumberExists_List {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[] arrayOfIntegers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("\nEnter your number from 0 to 10 : ");
        int myValley = input.nextInt();

        System.out.println(checkValueList(myValley, arrayOfIntegers));

        input.close();

    }

    public static boolean checkValueList(int myValue, Integer[] array) {

        int foundValue = Arrays.asList(array).indexOf(myValue);
        return foundValue != -1;

    }
}

