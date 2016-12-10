package kitku;

/**
 * Created by haote on 2016/11/6.
 */
public class homeworkPractice1 {
    public static boolean checkWithinTen (int input){
        boolean a = false;
        for (int i = 0; i <= 10; i++){
            if (input == i){
                a = true;
            }
        }
        return  a;
       }
    public static int max(int input1,int input2){
        int result;
        if (input1 < input2){
            result = input2;
        }else{
            result = input1;
        }
        return  result;
    }
    public  static double average(int int1,int int2){
        int total = int1 + int2;
        double average = total / 2;
        return  average;
    }
    public static int nextInt(int input){
        int result = 2;
        for (int i = input + 1; i < 10; i--){
            if (i / 10 == 0){
                result = i;
                break;
            }
        }
        return  result;
    }
    public static boolean yesOrNo(int input) {

        boolean result = false;
        return result;
    }
}
