package prep.it.singwai.class2;

/**
 * Created by Personal on 11/12/16.
 */
public class IcyHot {

    /*
    icyHot
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
    */

    public static boolean icyHot(int temp1, int temp2) {
        //return some boolean here after checking left and right
        if (temp1 > 100 && temp2 < 0) {
            return true;
        } else if (temp2 > 100 && temp1 < 0) {
            return true;
        } else {
            return false;
        }
//        if (something here is true){
//            //do something here
//        } else if (this is true ){
//            //do something this
//        } else if (this is true)){
//            //do this
//        } else {
//            //do this
//        }
    }

    public static void main(String args[]) {


    }
}
