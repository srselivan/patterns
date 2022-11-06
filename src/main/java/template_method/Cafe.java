package template_method;

public abstract class Cafe {
    protected OrderOptions orderOptions;

    public final void doOrder(OrderOptions orderOptions) {
        setOrderOptions(orderOptions);
        getPayment();
        makeCoffee();
    }

    protected abstract void makeCoffee();

    protected abstract void getPayment();

    protected void setOrderOptions(OrderOptions orderOptions){
        this.orderOptions = orderOptions;
    }
}
