package prep.it.singwai.weatherProject;

import prep.it.singwai.weatherProject.model.SingleWeather.WeatherModel;

/**
 * Created by Personal on 11/27/16.
 */
public class WeatherDriver {

    public static void main(String[] args) {

        Weather weather = new Weather();
        weather.init();
        long start = System.nanoTime();
        WeatherModel weatherModel = weather.getCurrentWeatherByCityName("Hong%20Kong");

        long end = System.nanoTime();

        System.out.println("Total time is " + (end - start));

        System.out.println(weatherModel.toString());
    }
}
