package kitku;

/**
 * Created by haote on 2016/11/12.
 */
public class IcyHot_Class2 {

    public static boolean icyHot(int temp1, int temp2){
        return  ((temp1 < 0 && temp2 > 100) ||  (temp2 < 0 && temp1 > 100));
    }



    public  static  void main (String args[]){
//        Scanner a = new Scanner(System.in);

        int temp1;
        int temp2;

//        System.out.println("Please enter temperature 1");
//        temp1 = a.nextInt();
//
//        System.out.println("Please enter temperature 2");
//        temp2 = a.nextInt();

        temp1 = UserInput.getInt();
        temp2 = UserInput.getInt();

        System.out.println(icyHot(temp1,temp2));
    }
}
