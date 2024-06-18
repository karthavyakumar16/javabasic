package immutable;

public class PaymentTest {
    public static void main(String[] args) {

        Account account1=new Account("12345678",965229535);
        Payment payment=new Payment(965229535,1000);
        Payment payment1=new Payment(account1,new Account("654321",994940451),200);
        System.out.println(payment);
        System.out.println(payment1);

    }
}
