package provincia;

public class Coordinates {

	private String name;

    private double latitude;

    private double longitude;


    public Coordinates(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "(" + name + ": " + latitude + ", " + longitude + ")";
    }

}
