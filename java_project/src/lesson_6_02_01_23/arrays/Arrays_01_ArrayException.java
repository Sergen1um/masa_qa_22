package lesson_6_02_01_23.arrays;

public class Arrays_01_ArrayException {
    public static void main(String[] args) {

        int array[] = {1, 2, 3};

//        for (int i = 0; i <= array.length; i++) {
//            System.out.println(array[i]);
//        }
        array[4] = 6;
    }
}
