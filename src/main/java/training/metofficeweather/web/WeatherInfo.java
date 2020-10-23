package training.metofficeweather.web;


// might just set up getters for all of these, so they can be referenced in the website, and displayed on info.html
    // job for today -- either of us really...
// not really sure what i'm doing either, some insight would be grand

public class WeatherInfo {
    private final String locationId;
    private final String relativeHumidity;
    private final String temperature;
    private final String visibility;
    private final String windDirection;
    private final String windSpeed;
    private final String maxUv;
    private final String weatherType;
    private final String precipitationProbability;

    public WeatherInfo(String locationId, String relativeHumidity, String temperature, String visibility, String windDirection, String windSpeed, String maxUv, String weatherType, String precipitationProbability) {
        this.locationId = locationId;
        this.relativeHumidity = relativeHumidity;
        this.temperature = temperature;
        this.visibility = visibility;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.maxUv = maxUv;
        this.weatherType = weatherType;
        this.precipitationProbability = precipitationProbability;
    }

    public String fullWeatherInfo() { // full weather info is never used
        return locationId;
        return relativeHumidity; // don't know why it doesn't like relative humidity. apparently it doesn't like my comments either, hoping it's just intelliJ. proper frying my noodle.
        return temperature;
        return visibility;
        return windDirection;
        return windSpeed;
        return maxUv;
        return weatherType;
        return precipitationProbability;
    }
}
