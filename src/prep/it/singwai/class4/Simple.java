package prep.it.singwai.class4;

public class Simple {

    //Sub-String
    //char array
    //Vending machin
    //Rot-13
    //https://en.wikipedia.org/wiki/ROT13

    public static void printStringAsCharArray(String in) {
        char[] chars = in.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.print("\n");
    }

    public static void printAsciiInputFromNumber(int in) {
        //Checking to see if the input is a valid input.
        if (in > 126 || in < 32) {
            System.out.println("Bad input");
        }
        //casting an in too char
        System.out.println((char) in);

    }

    public static void main(String[] args) {
//        String s1 = "Happy Halloween!";
//        String s2 = "Happy Thanksgiving!";
//        printStringAsCharArray(s1);
//        System.out.println(s1);
//
//        printStringAsCharArray(s2);
//        System.out.println(s2);
//
//
//        String sub1 = s1.substring(0, 5);
//        System.out.println(sub1);
        for (int i = 0; i < 26; i++) {
            printAsciiInputFromNumber(65 + i);
        }
    }
}
