package prep.it.singwai.weatherProject;

import com.google.gson.JsonObject;
import prep.it.singwai.weatherProject.model.SingleWeather.WeatherModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import rx.Observable;
import rx.functions.Action1;

import java.io.IOException;


public class Weather {

    private static final String API_KEY = "873959a6eec8dfc4bcdfe17deddd254c";
    private static final String TYPE_JSON = "JSON";

    public void init() {

    }

    public void getForecastWeatherByCityName(String name) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        Observable<JsonObject> observable = weatherService.getForecaseWeatherByCityNameService(name, API_KEY, TYPE_JSON);

        observable.subscribe(new Action1<JsonObject>() {
            @Override
            public void call(JsonObject jsonObject) {
                System.out.println(jsonObject.toString());
            }
        });

    }

    public void getForecasstWeatherByCityId(String id) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        Observable<JsonObject> observable = weatherService.getForecaseWeatherByCityIdService(id, API_KEY, TYPE_JSON);

        observable.subscribe(jsonObject -> System.out.println(jsonObject.toString()));
    }

    public WeatherModel getCurrentWeatherByCityName(String name) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        Call<WeatherModel> jsonObject = weatherService.getCurrentWeatherByCityNameService(name, API_KEY, TYPE_JSON);

        try {
            return jsonObject.execute().body();
        } catch (IOException e) {
            return null;
        }
    }

    public WeatherModel getCurrentWeatherByCityId(String id) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        Call<WeatherModel> jsonObject = weatherService.getCurrentWeatherByCityIdService(id, API_KEY, TYPE_JSON);

        try {
            return jsonObject.execute().body();
        } catch (IOException e) {
            return null;
        }
    }
}
