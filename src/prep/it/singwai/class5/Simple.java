package prep.it.singwai.class5;


import java.util.Date;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        //Excerise 1: Hello Person
        //Ask Person's name and say hello to him/her.

        //Bonus: Tell the person the current EST time.
        //if person's name is loser
        //Tell him he is not welcome.

        //Write a for loop that will greet the person X time, depending on the length on the person's name
        //Hint need scanner
        String name;
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Hello, what is your name?");
        name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if (!name.equalsIgnoreCase("loser")) {
                System.out.println("Hello, " + name);
            } else {
                System.out.print("You are not welcome.");
            }
        }

        System.out.println("The current time is " + date.toString());
    }


}
