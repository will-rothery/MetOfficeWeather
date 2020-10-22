package training.metofficeweather.web;

import org.glassfish.jersey.jackson.JacksonFeature;
import training.metofficeweather.Location;
import training.metofficeweather.Locations;
import training.metofficeweather.Root;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Scanner;

public class WeatherInfo {
    private final String locationId;

    private String elevation;
    private String id;
    private String latitude;
    private String longitude;
    private String name;
    private String region;
    private String area;

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
        Location[] locationsList = locations.getLocations();

        String userInput = "";


        userInput = locationId;
        for (Location location : locationsList) {
            if (userInput.equalsIgnoreCase(location.getId())) {
                System.out.println("Elevation: " + location.getElevation());
                System.out.println("ID: " + location.getId());
                System.out.println("Latitude: " + location.getLatitude());
                System.out.println("Longitude: " + location.getLongitude());
                System.out.println("Location name: " + location.getName());
                System.out.println("Region: " + location.getRegion());
                System.out.println("Area: " + location.getUnitaryAuthArea());
            }
        }
    }

    public String getLocationId() {
        return locationId;
    }
}
