package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Locations {
    @JsonProperty(value="Location")
    private Location[] locations;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
}
