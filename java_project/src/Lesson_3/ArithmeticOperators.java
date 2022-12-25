package Lesson_3;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;
        double c = 20;
        double d = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double result = (c / d);
        System.out.println("c / d = " + result);
        System.out.println("result * d = " + result * d);
        System.out.println("c % d = " + (c % d));

        int resultOfInt = a / b;
        double resultOfDouble = c / b;
        System.out.println("resultOfDouble = " + resultOfDouble);

    }
}
