package prep.it.singwai.class4;

/**
 */
public class Rot13 {

    public static boolean isLetter(char in) {
        return isUpperCaseLetter(in) || isLowerCaseLetter(in);
    }

    public static boolean isUpperCaseLetter(char in) {
        return (in >= 'A' && in <= 'Z');
    }

    public static boolean isLowerCaseLetter(char in) {
        return (in >= 'a' && in <= 'z');
    }

    public static char encription(char in) {
        if (!isLetter(in)) {
            return in;
        } else {
            if (isUpperCaseLetter(in)) {
                if (in >= 'N') {
                    return (char) (in - 13);
                } else {
                    return (char) (in + 13);
                }

            } else if (isLowerCaseLetter(in)) {
                if (in >= 'n') {
                    return (char) (in - 13);
                } else {
                    return (char) (in + 13);
                }
            }


        }
        //if in is not a letter, return the original

        //else rot13.
        return in;
    }

    public static void main(String[] args) {

        String in = "Z";
        char[] inChar = in.toCharArray();
        char[] inCharResult = new char[in.length()];

        for (int i = 0; i < inChar.length; i++) {
            inCharResult[i] = encription(inChar[i]);
        }

        String result = new String(inCharResult);
        System.out.println(result);
    }
}
