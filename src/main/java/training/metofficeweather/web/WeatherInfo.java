package training.metofficeweather.web;


// might just set up getters for all of these, so they can be referenced in the website, and displayed on info.html
    // job for today -- either of us really...


public class WeatherInfo {
    private String locationId;
    private String feelsLike;
    private String windGust;
    private String relativeHumidity;
    private String temperature;
    private String visibility;
    private String windDirection;
    private String windSpeed;
    private String maxUV;
    private String weatherType;
    private String precipitationProbability;


    public WeatherInfo(String locationId) {
        this.locationId = locationId;
        this.feelsLike = "Feels like: " + rep.getFeelsLike();
        this.windGust = "Wind Gust: " + rep.getWindGust();
        this.relativeHumidity = "Relative Humidity: " + rep.getRelativeHumidity();
        this.temperature = "Temperature: " + rep.getTemperature();
        this.visibility = "Visibility: " + rep.getVisibility();
        this.windDirection = "Wind Direction: " + rep.getWindDirection();
        this.windSpeed = "Wind Speed: " + rep.getWindSpeed();
        this.maxUV = "Max UV: " + rep.getMaxUv();
        this.weatherType = "Weather Type: " + rep.getWeatherType();
        this.precipitationProbability = "Precipitation Probability: " + rep.getPrecipitationProbability();
    }

    public String fullWeatherInfo() { // full weather info is never used
        return locationId;
    }
    public String getFeelsLike() {
        return feelsLike;
    }
    public String getWindGust() {
        return windGust;
    }
    public String getRelativeHumidity() {
        return relativeHumidity;
    }
    public String getTemperature() {
        return temperature;
    }
    public String getVisibility() {
        return visibility;
    }
    public String getWindDirection() {
        return windDirection;
    }
    public String getWindSpeed() {
        return windSpeed;
    }
    public String getMaxUv() {
        return maxUV;
    }
    public String getWeatherType() {
        return weatherType;
    }
    public String getPrecipitationProbability() {
        return precipitationProbability;
    }

}
