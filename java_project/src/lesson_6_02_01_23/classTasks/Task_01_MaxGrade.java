package lesson_6_02_01_23.classTasks;

import java.util.Random;

public class Task_01_MaxGrade {
    public static void main(String[] args) {

        Random random = new Random();
        String names[] = {"Irina", "Roman", "Gleb", "Karina", "Olga"};
        int grades[] = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);
        }

        int maxGrade = grades[0];
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " " + grades[i]);
        }

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                index = i;
            }
        }

        System.out.println("The best student is " + names[index] + " with grade " + grades[index]);
    }
}
