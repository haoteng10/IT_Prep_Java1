package Class4;

import kitku.UserInput;

import java.util.Scanner;

/**
 * Created by haote on 2016/11/26.
 */
public class SodaVendingMachine {

    public static double getMoneyFromCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert money:");
        double money = scanner.nextDouble();
        while (money > 10 && money < 0){
            Common.println("Sorry, we do not accept more than $10, here is your money back, please try again:");
            money = scanner.nextDouble();
        }
        return money;
    }

    public static void welcomeMessage(){
        Common.println("Welcome to vending machine:");
        Common.println("It's a hot day!");
    }

    public static void displayProduct(String[] name, double[] price){
        for (int i = 0; i < name.length; i++){
            System.out.println((i+1) + ". " + name[i] + " is $" + price[i]);
        }
    }

    public static int customerSelection(int[] quantity,String[] name, double[] price){
        Scanner scanner = new Scanner(System.in);
        int result = -1;
        while (result < 1 || result > 2){
            displayProduct(name,price);
            System.out.println("Please make your selection:");
            result = scanner.nextInt();
        }

        while (isEnoughQuantity(quantity,name,result) == false){
            System.out.println("Sorry, the item you choose is off sale, please enter again:");
            result = -1;
            while (result < 1 || result >= quantity.length){
                displayProduct(name,price);
                System.out.println("Please make your selection:");
                result = scanner.nextInt();
            }
        }
        return result;
    }


    public static boolean isEnoughMoney(double balance,int selection, double[] productPrice){
        return balance >= productPrice[selection];
    }

    public static boolean isEnoughQuantity(int[] Quantity, String[] productName, int selection){
        return (Quantity[selection] > 0);
    }

    public static void main(String args[]){

        double balance = 0;

        String[] productName = {"Coke","Orange Juice","Sprite"};
        double[] productPrice = {1.50,2,1.50};
        int[] productQuantity = {2,2,3};

        while (true){
            welcomeMessage();
            displayProduct(productName,productPrice);
            balance = getMoneyFromCustomer();

            int selection = customerSelection(productQuantity,productName,productPrice);



            //If there is enough money, give customer the product, and give money
            if (isEnoughMoney(balance,selection,productPrice)){
                Common.println("Here is your " + productName[selection]);
                Common.println("Your change is " + (balance - productPrice[selection]));
            }else{
                //else return the money
                Common.println("You don't have enough money,");
                Common.println("Your change is " + balance);
            }
        }


    }
}
