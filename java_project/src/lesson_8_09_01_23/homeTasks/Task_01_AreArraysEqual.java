package lesson_8_09_01_23.homeTasks;

import java.util.Arrays;

public class Task_01_AreArraysEqual {
    public static void main(String[] args) {

        int array1[] = {1, 2};
        int array2[] = {1, 2};
        int array3[] = {1, 3};
        int array4[] = {2, 1,};
        int array5[] = {1, 2, 3};

        System.out.println("Arrays are equal: " + checkArray(array1, array2));
        System.out.println("Arrays are equal: " + checkArrayAlternative1(array1, array3));
        System.out.println("Arrays are equal: " + checkArray(array1, array4));
        System.out.println("Arrays are equal: " + checkArray(array1, array5));

    }

    public static boolean checkArray(int array1[], int array2[]) {

        if (array1.length == array2.length) {

            for (int i = 0; i < array1.length; i++) {

                if (array1[i] != array2[i]) {

                    return false;

                }
            }

            return true;
        }

        return false;

    }

    public static boolean checkArrayAlternative1(int array1[], int array2[]) {

        return Arrays.equals(array1, array2);

    }
}
