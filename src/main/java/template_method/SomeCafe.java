package template_method;

public class SomeCafe extends Cafe{
    @Override
    protected void makeCoffee() {
        System.out.println("Make coffee with params: " + orderOptions.toString());
    }

    @Override
    protected void getPayment() {
        System.out.println("Get paid in cash");
    }
}
