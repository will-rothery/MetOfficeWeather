package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDetails {
    @JsonProperty(value="F")
    private String feelsLike;
    @JsonProperty(value="G")
    private String windGust;
    @JsonProperty(value="H")
    private String relativeHumidity;
    @JsonProperty(value="T")
    private String temperature;
    @JsonProperty(value="V")
    private String visibility;
    @JsonProperty(value="D")
    private String windDirection;
    @JsonProperty(value="S")
    private String windSpeed;
    @JsonProperty(value="U")
    private String maxUv;
    @JsonProperty(value="W")
    private String weatherType;

    public static String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }

    public static String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    public static String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public static String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public static String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public static String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public static String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public static String getMaxUv() {
        return maxUv;
    }

    public void setMaxUv(String maxUV) {
        this.maxUv = maxUv;
    }

    public static String getWeatherType() {
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

    @JsonProperty(value="Pp")
    private String precipitationProbability;
}


