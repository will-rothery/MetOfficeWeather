package training.metofficeweather.sitelist;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class WeatherByLocation {

    public WeatherByLocation() {


        Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b"; // key for datapoint

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build(); // build a client object

        String index = "14";

        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist"+index+"res=3hourly") // the index address was lost in the merge, are you able to fix this?
                .queryParam("key", apiKey);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON); // HTTP GET request


        Response jsonObjects = invocationBuilder.get(); // stores object from GET request
        ForecastRoot root = jsonObjects.readEntity(ForecastRoot.class); // reads object inside the root
        SiteRep siteRep = root.getSiteRep(); // reads objects inside the object that's inside the root
        DV dv = siteRep.getDv();
        WeatherLocation location = dv.getLocation();
        Period[] period = location.getPeriod();
        Rep[] rep = period[0].getRep(); // stores the objects in a list


        for (Rep details : rep) {
            System.out.println("Feels Like: " + Rep.getFeelsLike());
            System.out.println("Wind Gust: " + Rep.getWindGust());
            System.out.println("Relative Humidity: " + Rep.getRelativeHumidity());
            System.out.println("Temperature: " + Rep.getTemperature());
            System.out.println("Visibility: " + Rep.getVisibility());
            System.out.println("Wind Direction: " + Rep.getWindDirection());
            System.out.println("Wind Speed: " + Rep.getWindSpeed());
            System.out.println("Max UV: " + Rep.getMaxUv());
            System.out.println("Weather Type: " + Rep.getWeatherType());
            System.out.println("Precipitation Probability: " + details.getPrecipitationProbability());

        }
    }
}