package training.metofficeweather.sitelist;

public class Main {

    private static Object apiKey = "0f6a1d47-e487-4c1f-9e9c-6e5bb230508b";

    public String locationID = "";

    public static void main(String args[]) {

        // calls location finder (user input)
        LocationFinder locationFinder = new LocationFinder();

        // will return weather details (no longer user input - can remove this)
        WeatherByLocation weatherByLocation = new WeatherByLocation();


    }
}