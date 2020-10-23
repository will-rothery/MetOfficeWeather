package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Period {

    @JsonProperty(value = "Rep")
    private static WeatherDetails[] weatherDetails;
    private String type;
    private String value;

    // not sure what this page is for -- julius??



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


    // this looks important though

    public static WeatherDetails[] getWeatherDetails() {
        return weatherDetails;
    }

    public void setWeatherDetails(WeatherDetails[] weatherDetails) {
        this.weatherDetails = weatherDetails;
    }
}
