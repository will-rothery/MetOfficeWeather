package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty(value="Locations")
    private Locations locations;

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }
}
