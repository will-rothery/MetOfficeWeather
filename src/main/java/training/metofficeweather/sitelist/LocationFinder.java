package training.metofficeweather.sitelist;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.stream.Location;
import java.util.Scanner;


public class LocationFinder {

    public LocationFinder() {

        Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b"; // key for datapoint

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build(); // builds a client object

        // finds the json file by url
        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist")
                .queryParam("key", apiKey);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON); // builds a http GET request

        Response jsonObjects = invocationBuilder.get(); // stores the request target in "jsonObjects"
        Root root = jsonObjects.readEntity(Root.class); // reads the initial root of the file
        Locations locations = root.getLocations(); // reads the objects within the root
        WeatherLocation[] locationsList = locations.getLocations(); // stores the objects in an array

        // scanner to request user input
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // prints out location details of each object based on userInput (ID)
        while (!userInput.equalsIgnoreCase("exit")) { // loop until exit is called by user
            System.out.println("Enter location ID: "); // prompt for ID
            userInput = scanner.nextLine(); // reads the user's input and stores it
            for (WeatherLocation location : locationsList) { // loops through object list
                if (userInput.equalsIgnoreCase(location.getId())) { // searches for userInput in object list

                    // prints each item of the list in the object
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
        scanner.close();


    }


}
