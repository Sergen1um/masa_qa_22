package lesson_7_05_01_23.classTasks;

import java.util.ArrayList;
import java.util.Random;

public class Task_02_CustomerArrayList {
    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.random() * 10);
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\narrayList.size() = " + arrayList.size());

        for (Double number : arrayList) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum /arrayList.size()));

        arrayList.forEach(number -> System.out.println(number));
    }
}
