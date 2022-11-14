import observer.DesktopTaxiTreckerApp;
import observer.TaxiStation;
import observer.WebTaxiTreckerApp;
import template_method.CoffeeType;
import template_method.OrderOptions;
import template_method.SomeCafe;

import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation();

        taxiStation.AddCar();
        taxiStation.AddCar();
        taxiStation.AddCar();

        taxiStation.registerObserver(new WebTaxiTreckerApp());
        taxiStation.registerObserver(new DesktopTaxiTreckerApp());

        Timer timer = new Timer();
        timer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        taxiStation.notifyObservers();
                    }
                },
                0,
                10000
        );
    }
}
