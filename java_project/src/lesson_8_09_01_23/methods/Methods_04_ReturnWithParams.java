package lesson_8_09_01_23.methods;

public class Methods_04_ReturnWithParams {
    public static void main(String[] args) {
        System.out.println(sumNubmers(1,5));
        int c = sumNubmers(4,6);
        int first = 6;
        int second = 8;
        System.out.println(sumNubmers(first,second));


    }

    public static int sumNubmers(int a, int b) {
        return a + b;
    }
}
