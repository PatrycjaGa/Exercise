package Section14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe14_1 {

    public static int sumOfNumbers() {
        int num;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.println("Podaj liczbę różną od zera. Zero kończy wczytywanie liczb");
            num = scanner.nextInt();
            sum += num;


        } while (num != 0);
        return sum;

    }

}
