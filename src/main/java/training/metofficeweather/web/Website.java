package training.metofficeweather.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        return new ModelAndView("info", "weatherInfo", new WeatherInfo(locationId));
    }

    // main class for website
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Website.class, args);
    }
}