package lesson_6_02_01_23;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValues {
    public static void main(String[] args) {

    Random random = new Random();
    ThreadLocalRandom threadLocalRandom =ThreadLocalRandom.current();

    int randomInteger = random.nextInt();
    int randomIntegerWithBound = random.nextInt(10);
    double randomDouble = random.nextDouble();

    System.out.println("randomInteger = " + randomInteger);
    System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);
    System.out.println("randomDouble = " + randomDouble);

    int randomIntegerWithBounds = threadLocalRandom.nextInt(-100,20);
    System.out.println("randomIntegerWithBounds = " + randomIntegerWithBounds);
}
}
