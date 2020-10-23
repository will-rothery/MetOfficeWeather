package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DV {
    private  String dataDate;
    private String  type;
    @JsonProperty(value="Location") // would you be able to explain what this means?
    private WeatherLocation Location;


    // not sure what this page is for -- julius??

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WeatherLocation getLocation() {
        return Location;
    }

    public void setLocation(WeatherLocation location) {
        Location = location;
    }
}
