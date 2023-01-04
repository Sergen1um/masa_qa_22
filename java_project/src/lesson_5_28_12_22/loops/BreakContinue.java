package lesson_5_28_12_22.loops;

public class BreakContinue {
    public static void main(String[] args) {

        var a = 0;

        while (a < 20){
            a++;

            if (a % 5 == 0){
                continue;
            }

            if (a == 17){
                break;
            }

            System.out.print(a + " ");
        }
    }
}
