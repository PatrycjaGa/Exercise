package section3;

import java.util.Random;

public class Exe3_7 {

    public static int[] arraysInteger() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            array[i] = random.nextInt(11);
        }
        return array;
    }

    public static char[] arrayCharacter() {
        char[] arrayChar = new char[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arrayChar[i] = (char) (random.nextInt(10) + 48);//od 48 w asci zaczyna sie 0
        }
        return arrayChar;
    }
    public static void showArrayChar() {
        System.out.println();
        for (int i = 0; i < arrayCharacter().length; i++) {
            System.out.print("[" + arrayCharacter()[i] + "]" + ",");
        }
    }


    public static void showArray(){
        System.out.println();
        for (int i = 0; i < arraysInteger().length; i++) {
            System.out.print("[" + arraysInteger()[i] + "]" + ",");
        }
    }
}
