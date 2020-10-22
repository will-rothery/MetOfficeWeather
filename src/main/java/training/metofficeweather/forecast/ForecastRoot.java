package training.metofficeweather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastRoot {
    @JsonProperty(value="SiteRep")
    private SiteRep siteRep;

    public SiteRep getSiteRep() {
        return siteRep;
    }

    public void setSiteRep(SiteRep siteRep) {
        this.siteRep = siteRep;
    }



}
