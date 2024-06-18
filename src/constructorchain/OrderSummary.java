package constructorchain;

public class OrderSummary {
    private String id;
    private Order order;
    private double serviceCharges;
    public OrderSummary(Order order){
        this(order,10);
    }
    public OrderSummary(Order order,double serviceChargepercentage){
        this.order=order;
        double serviceCharges=(order.getOrderAmt()*serviceChargepercentage)/100;
                this.serviceCharges=serviceCharges;
    }

    public String getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }
}
