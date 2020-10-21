package training.metofficeweather;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class Main {

    private static Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b";

    public static void main(String args[]) {
        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=0f6a1d47-e487-4c1f-9e9c-6e5bb230508b")
                .queryParam("cnt", "10")
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                .queryParam("appid", apiKey);
    }

//    public ForecastResponse getForecast(String place) {
//        return target.queryParam("q", place)
//                .request(MediaType.APPLICATION_JSON)
//                .get(ForecastResponse.class);
//    }
}