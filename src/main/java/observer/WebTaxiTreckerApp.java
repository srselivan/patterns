package observer;

public class WebTaxiTreckerApp implements Observer{
    @Override
    public void Update(Coordinates coordinates, int taxiId) {
        //...
        System.out.println(this.getClass().getName() + ": Taxi id " + taxiId + " with coordinates:" + coordinates.toString());
    }
}
