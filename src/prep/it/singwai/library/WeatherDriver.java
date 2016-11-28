package prep.it.singwai.library;

import prep.it.singwai.library.model.SingleWeather.WeatherModel;

/**
 * Created by Personal on 11/27/16.
 */
public class WeatherDriver {

    public static void main(String[] args) {

        Weather weather = new Weather();
        weather.init();
        WeatherModel weatherModel = weather.getCurrentWeatherByCityName("Hong%20Kong");

    }
}
