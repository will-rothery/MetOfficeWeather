package training.metofficeweather;

import org.glassfish.jersey.jackson.JacksonFeature;
import training.metofficeweather.forecast.*;
import training.metofficeweather.sitelist.Location;
import training.metofficeweather.sitelist.Locations;
import training.metofficeweather.sitelist.Root;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Scanner;

public class Main {

    private static Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b";

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String place = input.nextLine();

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        WebTarget siteList = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?")
                .queryParam("key", apiKey);

        Invocation.Builder siteListInvocationBuilder =
                siteList.request(MediaType.APPLICATION_JSON);
        Response siteListResponse = siteListInvocationBuilder.get();
        Root root = siteListResponse.readEntity(Root.class);

        Locations locations = root.getLocations();
        Location[] location = locations.getLocations();


        String index = getID(place, location);

        WebTarget weatherData=client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/"+index+"?res=3hourly")
                .queryParam("key",apiKey);


        Invocation.Builder invocationBuilder1 = weatherData.request(MediaType.APPLICATION_JSON);
        Response weatherDataResponse=invocationBuilder1.get();
        ForecastRoot forecastRoot=weatherDataResponse.readEntity(ForecastRoot.class);

        DV dv = forecastRoot.getSiteRep().getDv();
        Period[] period = dv.getLocation().getPeriod();
        REP[] report = period[0].getRep();

        System.out.println(forecastRoot.getSiteRep().getDv().getLocation());

    }

    public static String getID(String place, Location[] location) {
        for (Location loc : location) {
            if(place.equals(loc.getName()))
                return loc.getId();
        }
        return "Invalid name";
    }

}
