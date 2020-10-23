package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherLocation {
    private String elevation;
    private String id;
    private String latitude;
    private String longitude;
    private String name;
    private String country;
    private String continent;

    @JsonProperty(value="Period")
    // not sure what this^^ is for


    // getters and setters for LocationFinder.java

    private training.metofficeweather.sitelist.Period[] period;

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String lat) {
        this.latitude = lat;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String lon) {
        this.longitude = lon;
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

    public training.metofficeweather.sitelist.Period[] getPeriod() {
        return period;
    }

    public void setPeriod(training.metofficeweather.sitelist.Period[] period) {
        this.period = period;
    }
    // not sure whats going on here either, what's period?


    @Override
    public String toString() {
        return "Location{" +
                "elevation='" + elevation + '\'' +
                ", id='" + id + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", continent='" + continent + '\'' +
                ", period='" + period + '\'' +
                '}';
    }
}
