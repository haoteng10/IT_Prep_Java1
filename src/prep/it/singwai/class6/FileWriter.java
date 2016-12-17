package prep.it.singwai.class6;

import java.io.*;

public class FileWriter {

    public static void write(String fileName, String input) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            writer.write(input);
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String read(String fileName) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
}
