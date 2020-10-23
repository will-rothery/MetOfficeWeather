package training.metofficeweather.web;


// might just set up getters for all of these, so they can be referenced in the website, and displayed on info.html
    // job for today -- either of us really...
// not really sure what i'm doing either, some insight would be grand

public class WeatherInfo {
    private String locationId;
    private String relativeHumidity;
    private String temperature;
    private String visibility;
    private String windDirection;
    private String windSpeed;
    private String maxUv;
    private String weatherType;
    private String precipitationProbability;


    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getMaxUv() {
        return maxUv;
    }

    public void setMaxUv(String maxUv) {
        this.maxUv = maxUv;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public String getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(String precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }


    public WeatherInfo(String locationId) {
        this.locationId = locationId;
        this.relativeHumidity = "Relative Humidity: " + getRelativeHumidity();
        this.temperature = "Temperature: " + getTemperature();
        this.visibility = "Visibility: " + getVisibility();
        this.windDirection = "Wind Direction: " + getWindDirection();
        this.windSpeed = "Wind Speed: " + getWindSpeed();
        this.maxUv = "Max UV: " + getMaxUv();
        this.weatherType = "Weather Type: " + getWeatherType();
        this.precipitationProbability = "Precipitation Probability: " + getPrecipitationProbability();
    }

    public String fullWeatherInfo() { // full weather info is never used
        return locationId;
        return relativeHumidity;
        return temperature;
        return visibility;
        return windDirection;
        return windSpeed;
        return maxUv;
        return weatherType;
        return precipitationProbability;
    }
}
