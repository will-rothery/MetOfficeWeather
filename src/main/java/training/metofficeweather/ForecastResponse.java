package training.metofficeweather;
import java.util.ArrayList;

public class ForecastResponse {
        private double elevation;
        private int id;
        private double latitude;
        private double longitude;
        private String name;
        private String region;
        private String unitaryAuthArea;

        private java.util.List<Forecast> list = new ArrayList<>(); // need to create forecast class


        public double getElevation() {
            return elevation;
        }

        public void setElevation() {
            this.elevation = elevation;
        }

        public int getId() {
            return id;
        }

        public void setId() {
            this.id = id;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude() {
            this.latitude = latitude;
        }

        public double getLongitude() {
        return longitude;
        }

        public void setLongitude() {
        this.longitude = longitude;
        }

        public String getName() {
            return name;
        }

        public void setName() {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion() {
            this.region = region;
        }

        public String getUnitaryAuthArea() {
            return unitaryAuthArea;
        }

        public void setUnitaryAuthArea() {
            this.unitaryAuthArea = unitaryAuthArea;
        }


    }
