package Section4;

public class Exe4_2 {

    public static void words(){
        String word = "Dzień dobry";
        for (int i = 0; i<word.length();i++ ){
            System.out.println(word.charAt(i));
        }
    }
    public static void words_1(){
        String word = "Dzień dobry";
        for (int i = 0; i<word.length();i++ ){
            System.out.print(word.charAt(i) + " ");
            System.out.println();
        }
    }

    public static void words_2(){
        String word = "Dzień dobry";
        System.out.println(word.toUpperCase());
        }


    public static void words_3(){
        String word = "Dzień dobry";
        System.out.println(word.toLowerCase());
    }

    public static void words_4(){
        String word = "dzień dobry";
        word = word.substring(0,1).toUpperCase() + word.substring(1);
        System.out.println(word);
    }
}




