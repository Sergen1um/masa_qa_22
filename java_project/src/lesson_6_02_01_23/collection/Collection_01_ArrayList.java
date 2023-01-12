package lesson_6_02_01_23.collection;

import java.util.ArrayList;

public class Collection_01_ArrayList {
    public static void main(String[] args) {

    int array[] = new int[3];

    ArrayList<Integer> myArrayList = new ArrayList<>();

    System.out.println("myArrayList.size() = " + myArrayList.size());
    myArrayList.add(5);
    myArrayList.add(7);

//        for (Integer number : myArrayList) {
//            System.out.println(number);
//        }

        for (int i = 0; i < 15; i++) {
            myArrayList.add(i);
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());

//        for (Integer number : myArrayList) {
//            System.out.println(number);
//        }

        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
//        myArrayList.add(3,7);
        myArrayList.set(3, 7);
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));

        myArrayList.forEach(number -> System.out.print(number + " "));


//        System.out.println(myArrayList.indexOf(5));
//        System.out.println(myArrayList.indexOf(7));
//        System.out.println(myArrayList.indexOf(8));
//        System.out.println(myArrayList.indexOf(9));

    }
}

