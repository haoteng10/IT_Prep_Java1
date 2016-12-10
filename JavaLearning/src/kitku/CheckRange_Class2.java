package kitku;

/**
 * Created by haote on 2016/11/12.
 */
public class CheckRange_Class2 {

    public static boolean within(int x, int y, int input){
        return  ((input > x && input < y) || (input > y && input < x));
    }

    public static void main(String args[]){
//        Scanner a = new Scanner(System.in);

        int input1;
        int input2;
        int input3;

//        System.out.println("Please enter X");
//        input1 = a.nextInt();
//
//        System.out.println("Please enter Y");
//        input2 = a.nextInt();
//
//        System.out.println("Please enter the number you want to check:");
//        input3 = a.nextInt();

        input1 = UserInput.getInt();
        input2 = UserInput.getInt();
        input3 = UserInput.getInt();

        System.out.println(within(input1,input2,input3));
    }
}
