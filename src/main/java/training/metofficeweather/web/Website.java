package training.metofficeweather.web;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import training.metofficeweather.sitelist.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Controller
@EnableAutoConfiguration
public class Website {


    // this page needs work, by putting the extra parameters here (shown in red) i'm hoping i can reference them from the info.html
        // although i'm not sure if they should also be referenced in index.html also -- job for today -- Will


    // returns the index.html file
    @RequestMapping("/")
    ModelAndView home() {
        return new ModelAndView("index");
    }


    // when weatherInfo is called, will look up the location ID and hopefully return all of these parameters
    @RequestMapping("/weatherInfo")
    ModelAndView weatherInfo(@RequestParam("locationId") String locationId) {



        Object apiKey1 = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b"; // key for datapoint

        Client client1 = ClientBuilder.newBuilder().register(JacksonFeature.class).build(); // builds a client object

        // finds the json file by url
        WebTarget webTarget1 = client1.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist")
                .queryParam("key", apiKey1);

        Invocation.Builder invocationBuilder1 = webTarget1.request(MediaType.APPLICATION_JSON); // builds a http GET request

        Response jsonObjects1 = invocationBuilder1.get(); // stores the request target in "jsonObjects"
        Root root1 = jsonObjects1.readEntity(Root.class); // reads the initial root of the file
        Locations locations1 = root1.getLocations(); // reads the objects within the root
        WeatherLocation[] locationsList1 = locations1.getLocations(); // stores the objects in an array

        WeatherLocation locationFound = null;

        for (int i=0; i< locationsList1.length; i++) { // loops through object list
            if (locationId.equals(locationsList1[i].getId())) { // searches for userInput in object list
                locationFound = locationsList1[i];
            }
        }

        Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b"; // key for datapoint

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build(); // build a client object

        String index = locationFound.getId();

        WebTarget webTarget = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist"+index+"res=3hourly") // the index address was lost in the merge, are you able to fix this?
                .queryParam("key", apiKey);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON); // HTTP GET request


        Response jsonObjects = invocationBuilder.get(); // stores object from GET request
        ForecastRoot root = jsonObjects.readEntity(ForecastRoot.class); // reads object inside the root
        SiteRep siteRep = root.getSiteRep(); // reads objects inside the object that's inside the root
        DV dv = siteRep.getDv();
        WeatherLocation location = dv.getLocation();
        Period[] period = location.getPeriod();
        Rep[] rep = period[0].getRep(); // stores the objects in an array

        return new ModelAndView("info", "weatherInfo", new WeatherInfo(locationId));
    }

    // main class for website
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Website.class, args);
    }
}