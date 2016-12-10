package Class5;

import Class4.Common;
import kitku.UserInput;

import java.util.Scanner;

/**
 * Created by haote on 2016/12/3.
 */
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

    public static int askOperation(){
        System.out.println("Which operation would you like to perform?");
        System.out.println("1." + OPERATION_TYPE_ADD);
        System.out.println("2." + OPERATION_TYPE_SUBTRACT);
        System.out.println("3." + OPERATION_TYPE_MUTIPLTY);
        System.out.println("4." + OPERATION_TYPE_DIVIDE);

        Scanner myScanner = new Scanner(System.in);
        int result = myScanner.nextInt();

        if (isValidOperation(result)){
            return result;
        }else{
            return askOperation();
        }
    }

    public static boolean isValidOperation(int input){
        return input >= 1 && input <= 4;
    }

    public static double askOperand(){
        double a = UserInput.getDouble();
        return  a;
    }

    public static boolean isZero(double input){
        return input == 0;
    }


    public static void main (String[] args){
        double left,right;
        int myOperationType = askOperation();
        double result = 0;

        left = askOperand();
        right = askOperand();

        Common.println("Operation type is " + myOperationType);
        Common.println("Left is " + left);
        Common.println("Right is " + right);

        switch (myOperationType){
            case 1:
                result = left + right;
                break;
            case 2:
                result = left - right;
                break;
            case 3:
                result = left * right;
                break;
            case 4:
                if(isZero(right)){
                    Common.println("Right operand is not possible");
                }else{
                    result = left / right;
                }
                break;
        }

        Common.println("The answer is " + result);
    }
}
