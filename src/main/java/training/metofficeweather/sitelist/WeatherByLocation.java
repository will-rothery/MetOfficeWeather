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

    // i renamed this file
    public WeatherByLocation() {


        Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b"; // key for datapoint

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build(); // build a client object

        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist"+index+("this.location.fortheapiaddress") // the index address was lost in the merge, are you able to fix this?
                .queryParam("key", apiKey));

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON); // HTTP GET request


        // this is the area that is confusing me with the file names - but if they're renamed, should be able to get the weather information and store them inside the list "weatherDetails[]"
        Response jsonObjects = invocationBuilder.get(); // stores object from GET request
        ForecastRoot root = jsonObjects.readEntity(ForecastRoot.class); // reads object inside the root
        SiteRep siteRep = root.getSiteRep(); // reads objects inside the object that's inside the root
        WeatherDetails[] weatherDetails = Period.getWeatherDetails(); // stores the objects in a list


        // loops through objects in the weather details list and finds weather information
        for (WeatherDetails details : weatherDetails) {

            // these all work fine, and want to be accessed in a different way -- but need the renames to be finished so i know what to reference
            System.out.println("Feels Like: " + details.getFeelsLike());
            System.out.println("Wind Gust: " + details.getWindGust());
            System.out.println("Relative Humidity: " + details.getRelativeHumidity());
            System.out.println("Temperature: " + details.getTemperature());
            System.out.println("Visibility: " + details.getVisibility());
            System.out.println("Wind Direction: " + details.getWindDirection());
            System.out.println("Wind Speed: " + details.getWindSpeed());
            System.out.println("Max UV: " + details.getMaxUv());
            System.out.println("Weather Type: " + details.getWeatherType());
            System.out.println("Precipitation Probability: " + details.getPrecipitationProbability());

        }
    }
}