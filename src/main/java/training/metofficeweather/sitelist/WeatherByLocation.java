package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class WeatherByLocation {
    public WeatherByLocation() {
        Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b";

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();

        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist"+index+("this.location.fortheapiaddress")
                .queryParam("key", apiKey);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

        Response jsonObjects = invocationBuilder.get();
        ForecastRoot root = jsonObjects.readEntity(ForecastRoot.class);
        SiteRep siteRep = root.getSiteRep();
        WeatherDetails[] weatherDetails = Period.getWeatherDetails();

        for (WeatherDetails details : weatherDetails) {
            System.out.println("Feels Like: " + WeatherDetails.getFeelsLike());
            System.out.println("Wind Gust: " + WeatherDetails.getWindGust());
            System.out.println("Relative Humidity: " + WeatherDetails.getRelativeHumidity());
            System.out.println("Temperature: " + WeatherDetails.getTemperature());
            System.out.println("Visibility: " + WeatherDetails.getVisibility());
            System.out.println("Wind Direction: " + WeatherDetails.getWindDirection());
            System.out.println("Wind Speed: " + WeatherDetails.getWindSpeed());
            System.out.println("Max UV: " + WeatherDetails.getMaxUv());
            System.out.println("Weather Type: " + WeatherDetails.getWeatherType());

        }
    }
}