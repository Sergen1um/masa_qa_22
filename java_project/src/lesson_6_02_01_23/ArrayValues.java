package lesson_6_02_01_23;

import java.util.Random;

public class ArrayValues {
    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(30) + 1);
        }

        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                System.out.println(array[i]);

            if (array[i] == 0){
                System.out.println(array[i]);
            }
            else {
                System.out.println(array[i] + " is not 0");
            }
        }
    }
}
