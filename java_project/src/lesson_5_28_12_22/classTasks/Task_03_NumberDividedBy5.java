package lesson_5_28_12_22.classTasks;

public class Task_03_NumberDividedBy5 {
    public static void main(String[] args) {

        int a = 0;

        while (a <= 1000){
            if (a % 5 == 0){
                System.out.println("a = " + a);
            }
            a++;
        }
    }
}
