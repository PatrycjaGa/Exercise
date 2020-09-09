package section3;

public class Exe3_4 {
    public static String[] arrayWithLetters() {
        String[] array = new String[]{"p", "r", "o", "g", "r", "a", "m", "o", "w", "a", "n", "i", "e"};
        return array;
    }

    public static void showArray() {
        for (int i = 0; i < arrayWithLetters().length; i++) {
            System.out.print("[" + arrayWithLetters()[i] + "]" + ",");
        }
    }

    public static void showArraysBackward() {
        System.out.println();
        for (int i = arrayWithLetters().length - 1; i >= 0; --i) {
            System.out.print("[" + arrayWithLetters()[i] + "]" + ",");
        }
    }

    

}
