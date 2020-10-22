package training.metofficeweather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import training.metofficeweather.sitelist.Locations;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteRep {
    @JsonProperty(value="DV")
    private DV dv;
    public DV getDv() {
        return dv;
    }

    public void setDv(DV dv) {
        this.dv = dv;
    }



}
