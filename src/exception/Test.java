package exception;

public class Test {
    public static void main(String[] args) {
PaymentService paymentService=new PaymentService();



    paymentService.login("12345", "54321");
    paymentService.book();
    paymentService.payment();




}
}
