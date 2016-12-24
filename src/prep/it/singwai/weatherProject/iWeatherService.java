package prep.it.singwai.weatherProject;

import com.google.gson.JsonObject;
import prep.it.singwai.weatherProject.model.SingleWeather.WeatherModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


interface iWeatherService {

    @GET("weather")
    Call<WeatherModel> getCurrentWeatherByCityNameService(@Query("q") String name, @Query("appid") String api, @Query("mode") String responseType);//Default to json

    @GET("weather")
    Call<WeatherModel> getCurrentWeatherByCityIdService(@Query("id") String id, @Query("appid") String api, @Query("mode") String responseType);//Default to json

    @GET("forecast")
    Observable<JsonObject> getForecaseWeatherByCityNameService(@Query("q") String name, @Query("appid") String api, @Query("mode") String responseType);//Default to json

    @GET("forecast")
    Observable<JsonObject> getForecaseWeatherByCityIdService(@Query("id") String name, @Query("appid") String api, @Query("mode") String responseType);//Default to json

}
