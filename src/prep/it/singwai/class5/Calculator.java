package prep.it.singwai.class5;


import java.util.Scanner;

public class Calculator {

    public static final String OPERATION_TYPE = "OPERATION_TYPE";
    public static final String OPERATION_TYPE_ADD = "ADD";
    public static final String OPERATION_TYPE_SUBTRACT = "SUBTRACT";
    public static final String OPERATION_TYPE_MUTIPLTY = "MUTIPLTY";
    public static final String OPERATION_TYPE_DIVIDE = "DIVIDE";

    //Bonus
    //Mod
    //Percentage
    //Exponential

    public static int askOperation() {
        System.out.println("Which operation would you like to perform?");
        System.out.println("1:" + OPERATION_TYPE_ADD);
        System.out.println("2:" + OPERATION_TYPE_SUBTRACT);
        System.out.println("3:" + OPERATION_TYPE_MUTIPLTY);
        System.out.println("4:" + OPERATION_TYPE_DIVIDE);

        Scanner myScanner = new Scanner(System.in);
        int result = myScanner.nextInt();

        if (isValidOperation(result)) {
            return result;
        } else {
            return askOperation();
        }
    }

    public static boolean isValidOperation(int input) {
        return input >= 1 && input <= 4;
    }

    public static boolean isZero(double input) {
        return input == 0;
    }

    public static double askOperand() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your input");
        return myScanner.nextDouble();
    }


    public static void main(String[] args) {
        double left;
        double right;
        double result;
        int myOperatonType = askOperation();
        left = askOperand();
        right = askOperand();

        System.out.println("Operation Type is " + myOperatonType);
        System.out.println("left is " + left);
        System.out.println("right is " + right);

        if (myOperatonType == 1) {
            result = left + right;
        } else if (myOperatonType == 2) {
            result = left - right;
        } else if (myOperatonType == 3) {
            result = left * right;
        } else {
            if (isZero(right)) {
                //print not possible message
                System.out.println("Right operand can't be 0");
                result = -1;
            } else {
                result = left / right;
            }
        }

        if (isZero(right) && myOperatonType == 4) {
            System.out.println("result is unknown");
        } else {
            System.out.println("result is " + result);
        }
    }
}
