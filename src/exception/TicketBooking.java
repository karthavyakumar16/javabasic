package exception;

public class TicketBooking extends Login{

    public int noOfSeats=4;
    public int totalSeats=30;
    public void book(){
if(noOfSeats<=totalSeats){
    int remainingSeats=totalSeats-noOfSeats;
    System.out.println("booked seats"+noOfSeats);
    System.out.println("remaining seats"+remainingSeats);
}else{
    System.out.println("failed");
}
    }
}
