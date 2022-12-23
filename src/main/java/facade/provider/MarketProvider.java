package facade.provider;

import java.util.Random;

public class MarketProvider {
    Random priceGen;

    {
        priceGen = new Random();
    }

    public int onMarketUpdate() {
        return priceGen.nextInt();
    }
}
