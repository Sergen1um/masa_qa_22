package lesson_7_05_01_23.homeTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Task_03_DuplicateNumbers {
    public static void main(String[] args) {

        int numbers = 100;
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        HashMap<Integer, Integer> valuesOfDuplicate = new HashMap<>();
        Random randomNumbers = new Random();

        for (int i = 0; i < numbers; i++) {
            numbersArrayList.add(randomNumbers.nextInt(50));
        }

        for (Integer number : numbersArrayList) {
            if (valuesOfDuplicate.containsKey(number)) {
                valuesOfDuplicate.put(number, valuesOfDuplicate.get(number) + 1);
            } else {
                valuesOfDuplicate.put(number, 1);
            }
        }
        valuesOfDuplicate.forEach((number,count)->System.out.println(number +" "+count));
    }
}
