package lesson_6_02_01_23;

import java.util.Random;

public class RandomValuesArray {
    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new  int[100];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt();
            //System.out.println(array.length);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
