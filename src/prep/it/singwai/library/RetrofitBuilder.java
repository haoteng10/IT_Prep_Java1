package prep.it.singwai.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import prep.it.singwai.library.model.SingleWeather.WeatherModel;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Personal on 11/27/16.
 */
public class RetrofitBuilder {

    private static final String URL = "http://api.openweathermap.org/data/2.5/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(URL)
                    .build();
        }

        return retrofit;
    }
}