package prep.it.singwai.class1;


public class Summation {

    /*
        Here is a little reminder for the syntax
        public static (return type) (function name) (argument list)
     */

    /**
     * @param input : inclusive upper bounce of number that we are adding
     *              ex: input = 4
     *                  Result = 1 + 2 + 3 + 4
     */
    public static void addNumber(int input) {
        System.out.println("Hello add number");

        int result = 0;

        //for (start value, comparison, change value){
        for (int currentValue = 1; currentValue <= input; currentValue++) {
            result = result + currentValue;
        }

        System.out.println("The result is " + result);
    }


    /**
     * @param input : inclusive upper bounce of number that we are adding
     *              ex: input = 6
     *                  Result = 1 + 3 + 5
     *
     *                  input = 15
     *                  Result = 1+3+5+7+9+11+13+15 (Inclusive)
     */
    public static void addOddNumber(int input) {
        System.out.println("Hello add odd number");

        int result = 0;

        //for (start value, comparison, change value){
        for (int currentValue = 1; currentValue <= input; currentValue = currentValue + 2) {
            result = result + currentValue;
        }

        System.out.println("The result is " + result);

    }

    public static void main(String[] args) {
        System.out.println("Hello main");
        addNumber(10);
        addNumber(5);
        addNumber(100);
        addNumber(1000);
        addOddNumber(10);
    }
}
