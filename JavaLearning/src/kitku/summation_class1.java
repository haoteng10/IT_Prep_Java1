package kitku;


public class summation_class1 {

    //Public static returnType(Parameter) {argument list}
    public static void addoddnumber(int input){
        /*To add odd number from 1-10
         * Method 1: if statement with %*/
        int result = 0;
        int iteration = 0;
        while (iteration < input)
        {
            iteration++;
            if (iteration % 2 != 0) {
                result = result + iteration;
                //result += iteration
            }
        }
        // Method 2: To add 2
//        result = 0;
//        for (int currentValue = 1; currentValue <= 10; currentValue += 2){
//            result = result + iteration;
//        }
//
       System.out.println(result);
    }


    public static void main(String[] args){
        int num;
//        Scanner a = new Scanner(System.in);
//
//        System.out.println("Please enter a number");
//        num = a.nextInt();

        num = UserInput.getInt();

        addoddnumber(num);
    }
}
