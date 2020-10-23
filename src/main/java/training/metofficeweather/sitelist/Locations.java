package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Locations {
    @JsonProperty(value="Location")
    private WeatherLocation[] locations;

    // second getter and setter for location object list
    public WeatherLocation[] getLocations() {
        return locations;
    }

    public void setLocations(WeatherLocation[] locations) {
        this.locations = locations;
    }
}
