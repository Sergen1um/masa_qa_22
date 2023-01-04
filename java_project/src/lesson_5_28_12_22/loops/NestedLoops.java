package lesson_5_28_12_22.loops;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\ni = " + i);
            for (int j = 0; j < 15; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();

        }
    }
}
