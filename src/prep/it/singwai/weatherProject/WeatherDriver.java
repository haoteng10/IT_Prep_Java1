package prep.it.singwai.weatherProject;

import prep.it.singwai.weatherProject.model.SingleWeather.WeatherModel;

public class WeatherDriver {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService();
        weatherService.init();
        long start = System.nanoTime();
        WeatherModel weatherModel = weatherService.getCurrentWeatherByCityName("Hong%20Kong");
        long end = System.nanoTime();

        System.out.println("Total time is " + (end - start));

        System.out.println(weatherModel.toString());
    }
}
