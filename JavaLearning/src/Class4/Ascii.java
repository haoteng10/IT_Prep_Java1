package Class4;

/**
 * Created by haote on 2016/11/26.
 */
public class Ascii {
//Sub-String
    //char array
    //Vending machin
    //Rot-13
    //https://en.wikipedia.org/wiki/ROT13

    public static void printStringAsCharArray(String in) {
        char[] chars = in.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.print("\n");
    }

    public static char returnAsciiInputFromNumber(int in) {
        //Checking to see if the input is a valid input.
        if (in > 126 || in < 32) {
            System.out.println("Bad input");
        }
        //casting an in too char
        return ((char) in);

    }

    public static char returnAsciiInputFromNumberGetLower(int in){
        int falsein = in + 32 + 65;

        if (falsein > 126 || falsein < 32) {
            System.out.println("Bad input");
        }
        //casting an in too char
        return ((char) falsein);
    }

    public static int getAlphaNum(char in){
//        char[] alpha = new Char[26];
//        for (int i = 0 ; i < 26 ; i ++){
//            alpha[i] = (char) ('a'+ i);
//        }
//        return

        return in;
    }

    public static boolean isAlpha(char in){
        return isLowerCaseLetter(in) || isUpperCaseLetter(in);
    }

    public static boolean isUpperCaseLetter(char in){
        return (in >= 'A' && in <= 'Z');
    }

    public static boolean isLowerCaseLetter(char in){
        return (in >= 'a' && in <= 'z');
    }

    public static char encryptor(char in){
        char result;
        if (!isAlpha(in)){
            return in;
        }else{
            if(isUpperCaseLetter(in)){
                //Shift 64
                if (in > 'N'){
                    return (char)(in -13);
                }else{
                    return (char)(in + 13);
                }


            }else if (isLowerCaseLetter(in)){
                //Shift 96
                if (in >= 'n'){
                    return (char)(in -13);
                }else {
                    return (char)(in + 13);
                }
            }
        }
        return in;
    }


    public static void main(String[] args) {

        String in = "Happy Thanksgiving!";
        char[] inChar = in.toCharArray();
        char[] inCharResult = new char[in.length()];

        for (int i = 0; i < inChar.length; i++) {
            inCharResult[i] = encryptor(inChar[i]);
        }

        String result = new String(inCharResult);
        System.out.println(result);
    }
}
