package lesson_5_28_12_22.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert you number: ");
        int a = scanner.nextInt();

//        while (a < 10) {
//            System.out.println("a = " + a);
//            a++;
//        }

        do{
            System.out.println("Before a++ " + a);
            a++;
            System.out.println("After a++ " + a);
        }
        while (a < 10);

            System.out.println(a);
        }
    }
