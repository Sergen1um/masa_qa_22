package lesson_7_05_01_23.homeTasks;

import java.util.HashMap;

public class Task_02_Countries {
    public static void main(String[] args) {
        HashMap<String, String> cityCountryHashMap = new HashMap<>() {{
            put("Барад-Дур ", "Мордор ");
            put("Карн Дум ", "Ангмар ");
            put("Эребор ", "Одинокая гора ");
            put("Эдорас ", "Рохан ");
            put("Хоббитон ", "Шир ");
            put("Тумунзахар ", "Синие горы ");
            put("Казад-Дум ", "Мория ");
            put("Минас Тирит ", "Гондор ");
            put("Минас Итиль ", "Итилиэн ");
            put("Аннуминас ", "Арнор ");
        }};

        cityCountryHashMap.forEach((city, country) -> System.out.print(country + " "));
        cityCountryHashMap.forEach((city, country) -> System.out.print("\n" + city + " " + country));
        System.out.println("\n" + cityCountryHashMap.containsKey("Казад-Дум "));
        System.out.println(cityCountryHashMap.containsValue("Гондор "));

    }
}
