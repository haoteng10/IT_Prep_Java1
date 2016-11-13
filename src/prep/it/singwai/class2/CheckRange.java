package prep.it.singwai.class2;

/**
 * Created by Personal on 11/12/16.
 */
public class CheckRange {

    //within x-y
    //Write a function to check if number is within x-y

    public static boolean within(int x, int y, int input) {
        if ((input > x && input < y) || (input > y && input < x)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 10;
        int input = 1;

        boolean result = within(num1, num2, input);

        System.out.println(result);


    }
}
