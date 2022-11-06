package template_method;

public class OrderOptions {
    private CoffeeType type;
    private boolean milk;
    private String ingredients;

    public OrderOptions(CoffeeType type, boolean milk, String ingredients) {
        this.type = type;
        this.milk = milk;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "{" +
                "type=" + type +
                ", milk=" + milk +
                ", ingredients=" + ingredients  +
                '}';
    }
}
