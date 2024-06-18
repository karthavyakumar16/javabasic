package constructorchain;

public class OrderSwiggyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderAmt(200);

        OrderSummary orderSummary=new OrderSummary(order,25);

        System.out.println(orderSummary.getServiceCharges());
    }
}
