package prep.it.singwai.class2;

public class FindAverage {

    public static double findAverage(int left, int right) {
        return (left + right) / 2.0;
    }

    public static void main(String args[]) {
        int num1 = 100;
        int num2 = 151;

        double result = findAverage(num1, num2);

        System.out.println("The average of 2 number is " + result);

    }

}
