package lesson_5_28_12_22.classTasks;

public class Task_04_MultipleTable {
    public static void main(String[] args) {

        int count = 10;

        for (int i = 1; i < (count + 1); i++) {

            System.out.println("\n");

            for (int j = 1; j < (count + 1); j++) {
                System.out.printf("%4d", j * i);
            }
        }
    }
}
