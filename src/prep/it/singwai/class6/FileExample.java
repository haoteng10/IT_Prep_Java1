package prep.it.singwai.class6;

public class FileExample {

    public static void main(String[] args) {
        FileWriter.write("appleProduct", "this is some bad input, not real apple product");

        String appleProduct = FileWriter.read("appleProduct");
        System.out.println(appleProduct);
    }

}
