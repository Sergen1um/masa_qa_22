package lesson_7_05_01_23.homeTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Task_01_ThreeCollections {
    public static void main(String[] args) {

        int length = 10;

        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        ArrayList<String> namesArrayList = new ArrayList<>();
        HashMap<Integer, String> numbersNameHashMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            numbersArrayList.add(i);
        }
            Collections.addAll(namesArrayList,"Хорус Луперкаль", "Леман Русс", "Феррус Манус", "Рогал Дорн", "Робаут Жиллиман", "Магнус Красный", "Лион Эль’Джонсон", "Лоргар Аурелиан", "Джагатай Хан", "Конрад Кёрз");

        for (int i = 0; i < length; i++) {
            numbersNameHashMap.put(numbersArrayList.get(i), namesArrayList.get(i));
        }
        numbersNameHashMap.forEach((number, name) -> System.out.println(number + " - " + name));
    }
}
