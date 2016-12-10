package kitku;

import java.util.Scanner;

/**
 * Created by haote on 2016/11/19.
 */
public class ArrayExample {

    public static void main(String arg[]){
//        int[] age = {25,14,15,12,25,22,13,16};
//
//        for (int i = 0; i < age.length; i++){
//            System.out.println(age[i]);
//        }

        String[] name = new String[8];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< name.length; i++){
            System.out.println("Index " + i + " enter your name");
            name[i] = scanner.nextLine();
        }

        for (int i = 0; i < name.length; i++){
            System.out.println("The name of " + i + " is " + name[i]);
        }
    }
}
