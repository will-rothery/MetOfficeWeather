package training.metofficeweather.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Period {
    @JsonProperty(value="Rep")
    private REP[] rep;
     private String type;
     private String value;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public REP[] getRep() {
        return rep;
    }

    public void setRep(REP[] rep) {
        this.rep = rep;
    }
}
