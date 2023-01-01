package Lesson_4_26_12_22;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double maximum;
        double minimum;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        a = scanner.nextDouble();
        System.out.println("Введите второе число");
        b = scanner.nextDouble();
        System.out.println("Введите третье число");
        c = scanner.nextDouble();

        average = (a + b + c) / 3;
        System.out.println("average = " + average);

        maximum = (a >= b) ? a : b;
        maximum = (maximum >= c) ? maximum : c;

        minimum = (a <= b) ? a : b;
        minimum = (minimum <= c) ? minimum : c;

        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);
    }
}
