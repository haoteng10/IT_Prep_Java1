package Class4;

import java.net.CookieHandler;

/**
 * Created by haote on 2016/11/26.
 */
public class TestingSwitch {
    public static void main(String args[]){
        int a = 1;
        switch (a){
            case 1:
                Common.println("Hi");
                break;
            case 2:
                Common.println("World");
                break;
            default:
                Common.println("Invalid");


        }
    }
}
