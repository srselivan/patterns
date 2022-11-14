package observer;

public class TaxiCar implements Traceable{
    private int taxiId;
    private Coordinates coordinates;

    public TaxiCar(int taxiId, Coordinates coordinates) {
        this.taxiId = taxiId;
        this.coordinates = coordinates;
    }

    public int getTaxiId() {
        return taxiId;
    }

    @Override
    public Coordinates GetCoordinates() {
        coordinates.Update();
        return coordinates;
    }
}
