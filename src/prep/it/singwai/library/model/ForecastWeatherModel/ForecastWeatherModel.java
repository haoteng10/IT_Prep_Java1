
package prep.it.singwai.library.model.ForecastWeatherModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Generated("org.jsonschema2pojo")
public class ForecastWeatherModel {

    @SerializedName("city")
    @Expose
    public City city;
    @SerializedName("cod")
    @Expose
    public String cod;
    @SerializedName("message")
    @Expose
    public Double message;
    @SerializedName("cnt")
    @Expose
    public Integer cnt;
    @SerializedName("list")
    @Expose
    public java.util.List<SingleWeatherNode> list = new ArrayList<SingleWeatherNode>();

}
