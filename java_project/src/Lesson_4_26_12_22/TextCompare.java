package Lesson_4_26_12_22;

public class TextCompare {
    public static void main(String[] args) {

        String name = "Alex";
        String secondName = "Alex";
        String thirdName = "Alex2";
        String anotherName = "aLeX2";

        //Comparing address
        System.out.println(name == secondName);

        //Comparing address
        System.out.println(name == thirdName);

        //Comparing address
        String newName = new String("Alex");
        System.out.println(name == newName);

        boolean areEqual = name.equals(secondName);
        System.out.println("areEqual = " + areEqual);

        areEqual = secondName.equals(thirdName);
        System.out.println("areEqual = " + areEqual);

        areEqual = thirdName.equals(anotherName);
        System.out.println("areEqual = " + areEqual);

        areEqual = secondName.equals(newName);
        System.out.println("areEqual = " + areEqual);

        areEqual = thirdName.equals(anotherName);
        System.out.println("areEqual = " + areEqual);

        areEqual = thirdName.equalsIgnoreCase(anotherName);
        System.out.println("areEqual = " + areEqual);
    }
}
