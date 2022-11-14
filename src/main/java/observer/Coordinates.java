package observer;

public class Coordinates {
    private double latitude;
    private double longitude;
    private double generationRadius;

    {
        latitude = 56.299230;
        longitude = 43.982084;
        generationRadius = 0.05;
    }

    public Coordinates() {}

    public Coordinates(double latitude, double longitude, double generationRadius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.generationRadius = generationRadius;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Latitude: " + latitude + " Longitude: " + longitude;
    }

    public void Update() {
        // Only + for tests
        latitude += Math.random() * generationRadius;
        longitude += Math.random() * generationRadius;
    }
}
