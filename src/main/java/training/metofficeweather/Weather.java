package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    //@JsonProperty(i=)
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
    private String maxUV;
    @JsonProperty(value="W")
    private String weatherType;
    @JsonProperty(value="Pp")
    private String precipitationProbability;

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
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

    public String getMaxUV() {
        return maxUV;
    }

    public void setMaxUV(String maxUV) {
        this.maxUV = maxUV;
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
}
