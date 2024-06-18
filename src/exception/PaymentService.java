package exception;

public class PaymentService extends TicketBooking{
    public int ticketprice=100;
    public int balance=2500;
    public int totalticketprice;
    public void payment(){
        totalticketprice=noOfSeats*ticketprice;
        if(totalticketprice<=balance){
            int remainingbalance=totalticketprice-balance;
            System.out.println("tatal ticket price"+totalticketprice);
            System.out.println("remaining balance"+remainingbalance);
        }else{
            System.out.println("failed");
        }
    }
}
