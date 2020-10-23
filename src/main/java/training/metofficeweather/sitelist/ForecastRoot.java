package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastRoot {
    @JsonProperty(value="SiteRep")
    private SiteRep siteRep;

    // are you able to rename siterep? i'm not sure what this refers to, sorry
    public SiteRep getSiteRep() {
        return siteRep;
    }

    public void setSiteRep(SiteRep siteRep) {
        this.siteRep = siteRep;
    }



}
