package training.metofficeweather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherLocation {
    private  String i;
    private String lat;
    private String lon;
    private String name;
    private String country;
    private String continent;
    private String elevation;
    @JsonProperty(value="Period")
    private Period[] period;

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getId() {
        return i;
    }

    public void setId(String id) {
        this.i = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Period[] getPeriod() {
        return period;
    }

    public void setPeriod(Period[] period) {
        this.period = period;
    }
}
