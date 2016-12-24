
package prep.it.singwai.weatherProject.model.ForecastWeatherModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Weather {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("Main")
    @Expose
    public String main;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("icon")
    @Expose
    public String icon;

}
