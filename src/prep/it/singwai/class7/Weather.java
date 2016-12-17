package prep.it.singwai.class7;

import prep.it.singwai.class6.FileWriter;

public class Weather {

    public static void main(String[] args) {
        String output = FileWriter.read("nyWeather.json");
        System.out.println(output);
    }
}
