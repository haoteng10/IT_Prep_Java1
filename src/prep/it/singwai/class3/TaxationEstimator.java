package prep.it.singwai.class3;

import java.util.Scanner;

public class TaxationEstimator {
    //Ask visitor's name
    //Ask visitor's income
    //Calculate his/her tax with the follow formula
    //Tax formula = {
    //    0 >= income <= 20000    10%
    //    income > 20000           20%
    //    }
    //Print out the result in a human readable way.
    //Hint: LOOK UP YOUR NOTE
    //Hint: Use Scanner to ask for user's input

    //Bonus: separate them in different function.

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        return scanner.nextLine();
    }

    public static int askIncome() {
        Scanner scanner = new Scanner(System.in);
        int income = -1;
        while (income < 0) {
            System.out.println("What is your income?");
            income = scanner.nextInt();
        }
        return income;
    }

    public static double calculateTax(int income) {
        //income is always a positive number.
        if (income > 20000) {
            return income * .2;
        } else {
            return income * .1;
        }
    }

    public static void printTaxReport (String name, int income, double tax){
        System.out.println("Name: " + name);
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);

    }


    public static void main(String args[]) {
        String name = askName();
        int income = askIncome();
        double tax = calculateTax(income);
        printTaxReport(name, income, tax);
    }
}
