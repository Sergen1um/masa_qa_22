package lesson_7_05_01_23.collection;

import java.util.HashMap;
import java.util.Map;

public class Collection_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1111, "Alex");
        hashMap.put(2222, "Irina");
        hashMap.put(3333, "Shura");
        hashMap.put(4444, "Karina");

//        System.out.println(hashMap.get(1111));
//        System.out.println(hashMap.get(1112));
//        System.out.println(hashMap.containsKey(1112));
//        System.out.println(hashMap.containsKey(2222));
//        System.out.println(hashMap.containsValue(""));
//        System.out.println(hashMap.containsValue("Karina"));
//        System.out.println(hashMap);

//        for (Map.Entry<Integer, String> pairOfValues : hashMap.entrySet()) {
//            System.out.println(pairOfValues.getKey() + " - " + pairOfValues.getValue());
//    }

        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));
        hashMap.put(5555,"Donald Trump");
        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));
        }
    }

