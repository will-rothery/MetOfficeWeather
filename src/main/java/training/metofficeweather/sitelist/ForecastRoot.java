package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastRoot {

    @JsonProperty(value="SiteRep")
    private SiteRep siteRep;

    // looks inside the root and finds rep by site

    public SiteRep getSiteRep() {
        return siteRep;
    }

    public void setSiteRep(SiteRep siteRep) {
        this.siteRep = siteRep;
    }
}
