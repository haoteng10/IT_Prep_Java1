package kitku;

import java.util.Scanner;

/**
 * Created by haote on 2016/11/12.
 */
public class UserInput {

    public static int getInt(){
        Scanner a = new Scanner(System.in);
        int input;

        System.out.println("Please enter a integer:");
        input = a.nextInt();
        return  input;
    }

    public static  String getString(){
        Scanner a = new Scanner(System.in);

        String input;

        System.out.println("Please enter a string:");
        input = a.next();

        return input;
    }

    public static  boolean getBoolean() {
        Scanner a = new Scanner(System.in);

        Boolean input;

        System.out.println("Please enter a boolean:");
        input = a.nextBoolean();

        return input;
    }

    public static double getDouble(){
        Scanner a = new Scanner(System.in);

        Double input;

        System.out.println("Please enter a double:");
        input = a.nextDouble();

        return input;
    }

    public static String getName(){
        Scanner a = new Scanner(System.in);

        String input;

        System.out.println("Please enter your name:");
        input = a.next();

        return input;
    }

    public static double getIncome(){
        Scanner a = new Scanner(System.in);
        System.out.println("What is your income?");
        return  a.nextDouble();
    }

//    public static void main(String args[]){
//        Scanner userReader = new Scanner(System.in);
//
//        int myInt;
//        String myString;
//        double myDouble;
//        boolean myBoolean;
//
//        System.out.println("Input Int");
//        myInt = userReader.nextInt();
//
//        System.out.println("Input String");
//        myString = userReader.next();
//
//        System.out.println("Input double");
//        myDouble = userReader.nextDouble();
//
//        System.out.println("Input boolean");
//        myBoolean = userReader.nextBoolean();
//
//    }
}
