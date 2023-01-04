package lesson_5_28_12_22.classTasks;

public class Task_02_EvenMumbersForLoop {
    public static void main(String[] args) {
        int count = 1001;

        for (int i = count; i >=0; i--) {
           if (i % 2 == 0){
               System.out.println(i);
           }
        }
    }
}
