package prep.it.singwai.class2;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        Scanner userReader = new Scanner(System.in);

        int myInt;
        String myString;
        double myDouble;
        boolean myBoolean;

        System.out.println("Input int");
        myInt = userReader.nextInt();

        System.out.println("Input String");
        myString = userReader.next();

        System.out.println("Input double");
        myDouble = userReader.nextDouble();

        System.out.println("Input boolean");
        myBoolean = userReader.nextBoolean();

        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDouble);
        System.out.println(myBoolean);
    }
}
