package prep.it.singwai.class2;

public class Bigger {

    //print bigger number
    //Write a function that take 2 int and print the bigger number
    //If they are equal print equal
    public static void printBigger (int left, int right){
        if (left > right){
            System.out.println ("The bigger number is " + left);
        } else if (right > left){
            System.out.println ("The bigger number is " + right);
        } else {
            System.out.println ("The number is equal");
        }
    }

    //Return bigger number
    //Write a function that take 2 int and return the bigger number
    //If they are equal return one of the number
    public static int returnBigger (int left, int right){
        if (left > right){
            return  left;
        } else if (right > left){
            return right;
        } else {
            return right;
        }
    }


    public static void main(String[] args) {
        int age = returnBigger(10, 55);
        System.out.println("The older person is age " + age);

        int year = returnBigger(2016, 2055);
        System.out.println("The later year is " + year);

//        printBigger(10, 20);
//        printBigger(0, 10);
//        printBigger(-100, 10);
//        printBigger(-100, -100);
//
//        String computer = "Apple Mac Computer";
//        int bigger = 10;


//        System.out.print("Hello");

//        someFun();
    }

    public static void someFun (){

    }
}


