package kitku;


/**
 * Created by haote on 2016/11/12.
 */
public class Max {
    public static void printBigger(double left, double right){
        if (left > right){
            System.out.println("The bigger number is " + left);
        }else if (right > left){
            System.out.println("The bigger number is " + right);
        }else{
            System.out.println("The number is equal.");
        }
    }

    public static int returnBigger(int left, int right){
        if (left > right){
            return  left;
        }else{
            return right;
        }
    }

    public static void main(String[] args) {
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

        System.out.println(returnBigger(num1,num2));
    }
}

