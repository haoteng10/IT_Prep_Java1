package prep.it.singwai.class4;

/**
 * Created by Personal on 11/26/16.
 */
public class Rot13Mapping {

    public static void main(String[] args) {
        //This is show the mapping of Rot 13
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('A' + i));
        }
        System.out.println("");
        for (int i = 13; i < 26; i++) {
            System.out.print((char) ('A' + i));
        }
        for (int i = 0; i < 13; i++) {
            System.out.print((char) ('A' + i));
        }
    }
}
