package training.metofficeweather.web;


public class WeatherInfo {
    private final String locationId;
    private final String relativeHumidity;
    private final String temperature;
    private final String visibility;
    private final String windDirection;
    private final String windSpeed;
    private final String maxUv;
    private final String weatherType;

    public WeatherInfo(String locationId, String relativeHumidity, String temperature, String visibility, String windDirection, String windSpeed, String maxUv, String weatherType) {
        this.locationId = locationId;
        this.relativeHumidity = relativeHumidity;
        this.temperature = temperature;
        this.visibility = visibility;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.maxUv = maxUv;
        this.weatherType = weatherType;
    }

    public String fullWeatherInfo() {
        return locationId;
        return relativeHumidity;
        return temperature;
        return visibility;
        return windDirection;
        return windSpeed;
        return maxUv;
        return weatherType;
    }
}
