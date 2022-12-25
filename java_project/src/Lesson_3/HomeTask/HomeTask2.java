package Lesson_3.HomeTask;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("i1 = " + i1 + "; i2 = " + i2 + "; d1 = " + d1 + "; d2 = " + d2 + "; l = " + l);
        System.out.println("(i2 / d1) + (d2 % i1) - l = ?");
        System.out.println("(" + i2 + " / " + d1 + ") " + "+ " + "(" + d2 + " % " + i1 + ") " + "- " + l + " = " + result);
        System.out.println("result = " + result + "\n");

        System.out.println("Задание 2:");
        int a = 5;
        int b = 8;
        int aResult = a-- - --a + ++a + a++ + a;
        int bResult = ++b - b++ + ++b - --b;
        System.out.println("a = " + a);
        System.out.println("a-- - --a + ++a + a++ + a = " + aResult + "\n");
        System.out.println("b = " + b);
        System.out.println("++b - b++ + ++b - --b = " + bResult + "\n");

        System.out.println("Задание 3:");
        int x = 10;
        int y = 12;
        int z = 3;
        System.out.println("x = " + x + "; y = " + y + "; z = " + z );
        System.out.println("1. x += y - x++ * z");
        System.out.println("2. z = --x - y * 5");
        System.out.println("3. y /= x + 5 % z");
        System.out.println("4. z = x++ + y * 5");
        System.out.println("5. x = y - x++ * z");
        System.out.println("x = ?; y = ?; z =?");
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println("x = " + x + "; y = " + y + "; z = " + z );
    }
}
