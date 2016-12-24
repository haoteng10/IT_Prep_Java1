package prep.it.singwai.weatherProject;

import prep.it.singwai.weatherProject.model.SingleWeather.Sys;
import prep.it.singwai.weatherProject.model.SingleWeather.Weather;
import prep.it.singwai.weatherProject.model.SingleWeather.WeatherModel;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by haote on 2016/12/24.
 */
public class WeatherReporter {

    public static void main(String[] args){
        WeatherService weatherService = new WeatherService();
        weatherService.init();

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Please type the city you want to lookup:");
        input = scanner.next();

        WeatherModel weatherModel = weatherService.getCurrentWeatherByCityName(input);

        printWeather(weatherModel);

    }

    public static void printWeather(WeatherModel weatherModel){
        System.out.println("Name: " + weatherModel.getName());
        System.out.println("Temp: " + converterToC(weatherModel.getMain().getTemp()));
        System.out.println("Temp Max: " + converterToC(weatherModel.getMain().getTempMax()));
        System.out.println("Temp Min: " + converterToC(weatherModel.getMain().getTempMin()));
        System.out.println("Coor: " + weatherModel.getCoord().toString());

        List<Weather> weatherList = weatherModel.getWeather();
        String desc = "";
        if (weatherList != null && !weatherList.isEmpty()){
            for (int i = 0; i < weatherList.size(); i++){
                desc += weatherList.get(i).getDescription() + " ";
            }
        }
        System.out.println("Desc: " + desc);
    }

    public static double converterToC(double in){
        return Double.parseDouble(String.format(Locale.ENGLISH, "%.2f" , (in - 273.15)));
    }
}
