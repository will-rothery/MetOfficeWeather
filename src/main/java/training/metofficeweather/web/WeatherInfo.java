package training.metofficeweather.web;

import org.glassfish.jersey.jackson.JacksonFeature;

import training.metofficeweather.sitelist.Locations;
import training.metofficeweather.sitelist.Root;
import training.metofficeweather.sitelist.WeatherLocation;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class WeatherInfo {
    private final String locationId;

    public WeatherInfo(String locationId) {
        this.locationId = locationId;


        Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b";

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();


        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist")
                .queryParam("key", apiKey);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

        Response jsonObjects = invocationBuilder.get();
        Root root = jsonObjects.readEntity(Root.class);
        Locations locations = root.getLocations();
        WeatherLocation[] locationsList = locations.getLocations();
        String iD = getLocationId();

        for (WeatherLocation location : locationsList) {
            if (locationId.equalsIgnoreCase(location.getId())) {
                System.out.println("Elevation: " + location.getElevation());
                System.out.println("ID: " + location.getId());
                System.out.println("Latitude: " + location.getLatitude());
                System.out.println("Longitude: " + location.getLongitude());
                System.out.println("Location name: " + location.getName());
                System.out.println("Region: " + location.getCountry());
                System.out.println("Area: " + location.getContinent());
            }
        }
    }

    public String getLocationId() {
        return locationId;
    }
}
