package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DV {
    private  String dataDate;
    private String  type;
    @JsonProperty(value="Location")
    private WeatherLocation Location;

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
