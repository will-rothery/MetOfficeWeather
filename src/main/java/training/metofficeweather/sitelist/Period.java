package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Period {

    @JsonProperty(value = "Rep")
    private static WeatherDetails[] weatherDetails;
    private String type;
    private String value;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static WeatherDetails[] getWeatherDetails() {
        return weatherDetails;
    }

    public void setWeatherDetails(WeatherDetails[] weatherDetails) {
        this.weatherDetails = weatherDetails;
    }
}
