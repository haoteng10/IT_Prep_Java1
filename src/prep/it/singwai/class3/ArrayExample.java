package prep.it.singwai.class3;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String args[]) {
        //Array is a list of data.
//        int[] age = {25, 14, 15, 12, 25, 22, 13, 16};
//
//        System.out.println("Print one by one start");
//        System.out.println(age[0]); //print 25
//        System.out.println(age[1]); //print 14
//        System.out.println(age[2]); //print 15
//        System.out.println(age[3]); //print 22
//        System.out.println(age[4]); //print 25
//        System.out.println(age[5]); //print 22
//        System.out.println(age[6]); //print 23
//        System.out.println(age[7]); //print 16
//        System.out.println("Print one by one end");
//
//        for (int i = 0; i < age.length; i++) {
//            System.out.println("Printing from array " + age[i]);
//        }



        String[] name = new String[8];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < name.length; i++) {
            System.out.println("Index " + i + " enter your name");
            name[i] = scanner.nextLine();
        }

    }
}
