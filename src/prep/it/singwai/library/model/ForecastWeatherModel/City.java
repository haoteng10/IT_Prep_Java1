
package prep.it.singwai.library.model.ForecastWeatherModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class City {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("coord")
    @Expose
    public Coord coord;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("population")
    @Expose
    public Integer population;
    @SerializedName("sys")
    @Expose
    public Sys sys;

}
