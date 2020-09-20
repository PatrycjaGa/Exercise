package Section13;

import java.util.Scanner;

public class Exe13_1 {

    public static String name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String personName = scanner.nextLine();
        return personName;
    }

    public static void showName(){
        String names = name();
        char lastLetter = names.charAt(names.length() - 1);
        if (lastLetter == 'a'){
            System.out.println(names + " jest kobietą");
        }else
        System.out.println(names + " jest mężczyzną");
    }
}
