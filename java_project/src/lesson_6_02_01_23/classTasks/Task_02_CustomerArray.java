package lesson_6_02_01_23.classTasks;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task_02_CustomerArray {
    public static void main(String[] args) {

        Random random = new Random();
        double myArray[] = new double[10];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (1000 * random.nextDouble());
            System.out.println(myArray[i] + " ");
        }

//        double myArray2[] = ThreadLocalRandom.current().doubles(10,0,100).toArray();
//
//        for (double number : myArray2) {
//            System.out.println(number);
//    }
    }
}
