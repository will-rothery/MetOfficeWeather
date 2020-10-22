package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteRep {
    @JsonProperty(value="DV")
    private static DV dv;
    public static DV getDv() {
        return dv;
    }

    public void setDv(DV dv) {
        this.dv = dv;
    }



}
