package prep.it.singwai.class4;

import java.util.Scanner;

public class SodaVendingMachine {

    public static void welcomeMessage() {
        System.out.println("welcome to vending machine.");
        System.out.println("It's a hot day!");
    }

    public static void displayProduct(String[] name, double[] price) {
        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + ". " + name[i] + " is $" + price[i]);
        }
    }

    public static double getMoneyFromCustomer() {
        System.out.println("Please insert money.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int customerSelection(String[] name, double[] price) {
        int select = -1;
        Scanner scanner = new Scanner(System.in);

        while (!(select >= 1 && select <= name.length)) {
            displayProduct(name, price);
            System.out.println("Please make your selection.");
            select = scanner.nextInt();
        }

        return select - 1;

    }

    public static boolean isEnoughMoney(double balance, int selection, double[] productPrice) {
        return balance >= productPrice[selection];
    }

    public static void main(String[] args) {
        String[] productName = {"Coke", "Orange Juice", "Sprite"};
        double[] productPrice = {1.50, 2, 1.50};
        int[] productQuantity = {2, 2, 2};

        while (true) {
            double balance = 0;
            welcomeMessage();
            displayProduct(productName, productPrice);
            balance = getMoneyFromCustomer();

            int selection = customerSelection(productName, productPrice);

            //if there is enough money, give customer the product, and give change.
            if (isEnoughMoney(balance, selection, productPrice)) {
                System.out.println("Here is your " + productName[selection]);
                System.out.println("Your change is " + (balance - productPrice[selection]));
            } else {
                System.out.println("You don't have enough money.");
                System.out.println("Your change is " + balance);
            }
            //else return the money
        }
    }
}
