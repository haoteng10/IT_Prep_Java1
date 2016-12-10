package kitku;

/**
 * Created by haote on 2016/11/12.
 */
public class FindAverage_Class2 {

    public static double findAverage(int left, int right){
        return  (left + right) / 2f;
    }

    public static void main(String args[]){
        int num1;
        int num2;

//        Scanner a = new Scanner(System.in);
//
//        System.out.println("Please enter number 1");
//        num1 = a.nextInt();
//
//        System.out.println("Please enter number 2");
//        num2 = a.nextInt();

        num1 = UserInput.getInt();
        num2 = UserInput.getInt();

        double result = findAverage(num1,num2);
        System.out.println("The average is " + result);
    }

}

