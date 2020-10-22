package training.metofficeweather;

import com.fasterxml.jackson.databind.JsonNode;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b";


    public static void main(String args[]) {

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();


        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist")
                .queryParam("key", apiKey);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

        Response jsonObjects = invocationBuilder.get();
        Root root = jsonObjects.readEntity(Root.class);
        Locations locations = root.getLocations();
        Location[] locationsList = locations.getLocations();

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.println("Enter location name: ");
            userInput = scanner.nextLine();
            for (Location location : locationsList) {
                if (userInput.equalsIgnoreCase(location.getName())) {
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
        scanner.close();
    }
}