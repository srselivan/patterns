package facade.provider;

public class Order {
    private String symbol;
    private int price;
    private int volume;
    private Operations operation;

    private int id;

    public Order(String symbol, int price, int volume, Operations operation, int id) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.operation = operation;
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public Operations getOperation() {
        return operation;
    }

    public int getId() {
        return id;
    }
}
