package facade.provider;

import java.util.ArrayList;
import java.util.Random;

public class TradingProvider {
    ArrayList<Order> orders;

    {
        orders = new ArrayList<>();
    }

    public boolean HaveOrders() {
        return !orders.isEmpty();
    }

    public int SendOrder(String symbol, int price, int volume, Operations operation) {
        int id = orders.size();

        orders.add(
                new Order(symbol, price, volume, operation, id)
        );

        return id;
    }

    public boolean CancelOrder(int id) {
        try {
            orders.remove(id);
            return true;
        } catch (Error error) {
            return false;
        }
    }
}
