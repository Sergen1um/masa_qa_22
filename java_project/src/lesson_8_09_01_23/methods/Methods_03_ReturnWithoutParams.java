package lesson_8_09_01_23.methods;

import java.util.Date;

public class Methods_03_ReturnWithoutParams {
    public static void main(String[] args) {

        long randomNumber = getRandomNumber();
        System.out.println("randomNumber = " + randomNumber);
        System.out.println(getRandomNumber());
    }

    public static long getRandomNumber() {

        Date date = new Date();
//        long currentDate = date.getTime();
        return  date.getTime();

    }
}
