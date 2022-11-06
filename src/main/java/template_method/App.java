package template_method;

public class App {
    public static void main(String[] args) {
        SomeCafe cafe = new SomeCafe();
        cafe.doOrder(new OrderOptions(
                CoffeeType.TYPE1,
                true,
                "ingredients"
        ));
    }
}
