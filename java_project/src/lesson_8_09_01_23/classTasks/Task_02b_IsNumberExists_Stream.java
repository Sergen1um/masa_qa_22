package lesson_8_09_01_23.classTasks;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_02b_IsNumberExists_Stream {
    public static void main(String[] args) {

        Random number = new Random();
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int myValley = -1;

        for (int i = 0; i < array.length; i++) {

            array[i] = number.nextInt(10);
            System.out.print(array[i] + " ");

        }

        while (!checkValueStream(myValley, array)) {

            System.out.println("\nEnter your number from 0 to 10 : ");
            myValley = input.nextInt();

            System.out.println(checkValueStream(myValley, array));
        }

        input.close();

    }

    public static boolean checkValueStream(int myValue, int[] array) {

        int foundValue = IntStream
                .range(0, array.length)
                .filter(i -> myValue == array[i])
                .findFirst()
                .orElse(-1);
        return foundValue != -1;

    }

}

