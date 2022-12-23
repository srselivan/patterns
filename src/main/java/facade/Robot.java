package facade;

import facade.provider.MarketProvider;
import facade.provider.Operations;
import facade.provider.Order;
import facade.provider.TradingProvider;

public class Robot {
    MarketProvider marketProvider;
    TradingProvider tradingProvider;

    public int Buy(String symbol, int price, int volume) {
        return tradingProvider.SendOrder(symbol, price, volume, Operations.BUY);
    }

    public int Sell(String symbol, int price, int volume) {
        return tradingProvider.SendOrder(symbol, price, volume, Operations.SELL);
    }

    public boolean Cancel(int id) {
        return tradingProvider.CancelOrder(id);
    }

    public void MarketInfo() {
        if (tradingProvider.HaveOrders()) {
            System.out.println("Current cale: " + marketProvider.onMarketUpdate());
        } else {
            System.out.println("No have orders");
        }
    }
}
