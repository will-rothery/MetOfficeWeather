package training.metofficeweather;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class Main {
    public static void main(String args[]) {

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=84ef00c5-4ca1-4998-b63e-771312586900")
                .queryParam("cnt","10")
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                .queryParam("appid", "84ef00c5-4ca1-4998-b63e-771312586900");

        public ForecastResponse getForecast(String place) {
            return target.queryParam("q", place)
                    .request(MediaType.APPLICATION_JSON)
                    .get(ForecastResponse.class);
        }

    }
}	
