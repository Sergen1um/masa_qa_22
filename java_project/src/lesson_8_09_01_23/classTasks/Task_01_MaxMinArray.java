package lesson_8_09_01_23.classTasks;

import java.util.ArrayList;
import java.util.Random;

public class Task_01_MaxMinArray {
    public static void main(String[] args) {

        Random randomNumbers = new Random();
        ArrayList<Integer> massiveOfNumbers = new ArrayList<>();
        int lenght = 10;

        for (int i = 0; i < lenght; i++) {

            int number = randomNumbers.nextInt(10);
            massiveOfNumbers.add(number);

        }

        massiveOfNumbers.forEach(number -> System.out.print(number + " "));
        System.out.println("\n" + "min value = " + minValue(massiveOfNumbers));
        System.out.println("max value = " + maxValue(massiveOfNumbers));
        System.out.println("sum value = " + sumValue(massiveOfNumbers));

    }

    public static int minValue(ArrayList<Integer> minMassiveOfNumbers) {

        int minNumber = Integer.MAX_VALUE;

        for (Integer minValue : minMassiveOfNumbers) {

            if (minValue < minNumber) {

                minNumber = minValue;

            }
        }

        return minNumber;

    }

    public static int maxValue(ArrayList<Integer> maxMassiveOfNumbers) {

        int maxNumber = Integer.MIN_VALUE;

        for (Integer maxValue : maxMassiveOfNumbers) {

            if (maxValue > maxNumber) {

                maxNumber = maxValue;
            }
        }

        return maxNumber;

    }

    public static double sumValue(ArrayList<Integer> sumMassiveOfNumbers) {

        double sumNumber = 0;

        for (Integer sumValue : sumMassiveOfNumbers) {
            sumNumber += sumValue;
        }

        return sumNumber / sumMassiveOfNumbers.size();

    }
}
//    public static int maxValue(double[] maxMassiveOfNumbers) {
//        Arrays.sort(maxMassiveOfNumbers);
//        return maxMassiveOfNumbers[maxMassiveOfNumbers.length - 1];
//    }
//    public static int maxValue(double[] sumMassiveOfNumbers) {
//        return Arrays.stream(sumMassiveOfNumbers).average().getAsDouble();
//    }