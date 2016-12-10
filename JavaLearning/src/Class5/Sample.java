package Class5;

import kitku.UserInput;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by haote on 2016/12/3.
 */
public class Sample {



    public static void main(String[] args){

        String a = UserInput.getName();
        DateFormat dataFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
        Date date = new Date();


        if (a.equalsIgnoreCase("loser")){
            System.out.println("You are not welcome.");
        }else{
            for (int i = 0; i < a.length(); i++){
                System.out.println("Hello, " + a);
                System.out.print("The current time is: " );
                System.out.print(dataFormat.format(date) + "\r\n");
            }
        }


    }
}
