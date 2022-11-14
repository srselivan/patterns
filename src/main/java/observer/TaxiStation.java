package observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TaxiStation implements Observable{
    private List<Observer> observers;
    private List<TaxiCar> cars;
    private int taxiCount;

    {
        cars = new ArrayList<TaxiCar>();
        observers = new ArrayList<Observer>();
        taxiCount = 0;
    }

    public void AddCar() {
        cars.add(new TaxiCar(
                ++taxiCount,
                new Coordinates()
        ));
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (var o: observers) {
            for (var car: cars) {
                o.Update(car.GetCoordinates(), car.getTaxiId());
            }
        }
    }
}
