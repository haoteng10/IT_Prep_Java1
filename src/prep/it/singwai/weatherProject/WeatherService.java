package prep.it.singwai.weatherProject;

import com.google.gson.JsonObject;
import prep.it.singwai.weatherProject.model.SingleWeather.WeatherModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import rx.Observable;
import rx.functions.Action1;

import java.io.IOException;


public class WeatherService {

    private static final String API_KEY = "7b6470d9e1c9124278d10f6b9a5c092e";
    private static final String TYPE_JSON = "JSON";

    public void init() {

    }

    public void getForecastWeatherByCityName(String name) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        iWeatherService iWeatherService = retrofit.create(iWeatherService.class);
        Observable<JsonObject> observable = iWeatherService.getForecaseWeatherByCityNameService(name, API_KEY, TYPE_JSON);

        observable.subscribe(new Action1<JsonObject>() {
            @Override
            public void call(JsonObject jsonObject) {
                System.out.println(jsonObject.toString());
            }
        });

    }

    public void getForecasstWeatherByCityId(String id) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        iWeatherService iWeatherService = retrofit.create(iWeatherService.class);
        Observable<JsonObject> observable = iWeatherService.getForecaseWeatherByCityIdService(id, API_KEY, TYPE_JSON);

        observable.subscribe(jsonObject -> System.out.println(jsonObject.toString()));
    }

    public WeatherModel getCurrentWeatherByCityName(String name) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        iWeatherService iWeatherService = retrofit.create(iWeatherService.class);
        Call<WeatherModel> jsonObject = iWeatherService.getCurrentWeatherByCityNameService(name, API_KEY, TYPE_JSON);

        try {
            return jsonObject.execute().body();
        } catch (IOException e) {
            return null;
        }
    }

    public WeatherModel getCurrentWeatherByCityId(String id) {
        Retrofit retrofit = RetrofitBuilder.getRetrofit();
        iWeatherService iWeatherService = retrofit.create(iWeatherService.class);
        Call<WeatherModel> jsonObject = iWeatherService.getCurrentWeatherByCityIdService(id, API_KEY, TYPE_JSON);

        try {
            return jsonObject.execute().body();
        } catch (IOException e) {
            return null;
        }
    }
}
