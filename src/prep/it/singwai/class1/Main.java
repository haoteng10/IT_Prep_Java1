package prep.it.singwai.class1;

public class Main {

    public static void main(String[] args) {
    /*
     * Learn about data type: int, double, boolean, String
	 * Learn about if statment
	 * Learn about for loop
	 * Learn about while loop
	 * Bonus: function.
	 *      Function with argument(s)
	 *      Function with return value
	 *
	 * Understand scope
	 */

        //This is a single lin
        // datatype variableName = value;
        String name1 = "Singwai";
        int age1 = 24;

        System.out.println(name1);
        System.out.println(age1);

        name1 = "Jack";
        age1 = 22;

        System.out.println(name1);
        System.out.println(age1);


        String name1Copy = name1;
        int age1Copy = age1;

        System.out.println(name1Copy);
        System.out.println(age1Copy);

        for (int i = 0 ; i < 10 ; i ++){
            System.out.print(name1Copy);
        }
    }
}