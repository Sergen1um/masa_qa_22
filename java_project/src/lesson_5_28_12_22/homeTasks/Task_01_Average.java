package lesson_5_28_12_22.homeTasks;

public class Task_01_Average {
    public static void main(String[] args) {

        int lastNumber = 100;
        int summary = 0;

        for (int i = 0; i < (lastNumber + 1); i++) {
            summary = summary + i;
        }
        System.out.println((double)summary / (lastNumber + 1));
    }
}
