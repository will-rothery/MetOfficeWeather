package training.metofficeweather;

import org.glassfish.jersey.jackson.JacksonFeature;

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
        String placeName = "";
        placeName = input.nextLine();

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=84ef00c5-4ca1-4998-b63e-771312586900")
                .queryParam("cnt", "10")
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                .queryParam("appid", "84ef00c5-4ca1-4998-b63e-771312586900");

        Invocation.Builder invocationBuilder =
                webTarget.request(MediaType.APPLICATION_JSON);
        invocationBuilder.header("some-header", "true");

        Response response = invocationBuilder.get();

        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));

        /*public ForecastResponse getForecast(String place) {
            return target.queryParam("q", place)
                    .request(MediaType.APPLICATION_JSON)
                    .get(ForecastResponse.class);
        }*/
    }
}	