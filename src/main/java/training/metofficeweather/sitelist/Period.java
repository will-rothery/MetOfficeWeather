package training.metofficeweather.sitelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Period {

    @JsonProperty(value = "Rep")
    private Rep[] rep;
    private String type;
    private String value;


    // period contains the type, the value and the actual weather report, another link in the chain

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

    public Rep[] getRep() {
        return rep;
    }

    public void setRep(Rep[] rep) {
        this.rep = rep;
    }

}
