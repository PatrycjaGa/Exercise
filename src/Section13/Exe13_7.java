package Section13;

import java.util.Scanner;

public class Exe13_7 {

    public static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz a: ");
        int a = scanner.nextInt();
        System.out.println("Wprowadz b: ");
        int b = scanner.nextInt();
        System.out.println("Wprowadz c: ");
        int c = scanner.nextInt();

        if ((a >= b) && (a > c)) {
            return a;
        } else if ((a >= b) && (a < c)) {
            return c;
        } else if ((a < b) && (b > c)) {
            return b;
        } else
            return c;

    }


        public static void showResult(){
            System.out.println("Największą liczbą jest: " + scanInt());
        }

    }

