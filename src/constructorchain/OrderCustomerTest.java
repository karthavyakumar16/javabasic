package constructorchain;

public class OrderCustomerTest {
    public static void main(String[] args) {


        Order order = new Order();
        order.setOrderAmt(200);

        OrderSummary orderSummary=new OrderSummary(order);

        System.out.println(orderSummary.getServiceCharges());

    }

}
