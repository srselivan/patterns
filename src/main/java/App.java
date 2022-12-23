import decorator.PropertyList;
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
        PropertyList list = new PropertyList();
        list.add("mail.host.protocol");
        list.showList();
    }
}
