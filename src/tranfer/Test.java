package tranfer;



public class Test {
    public static void main(String[] args) {
        AccountDetails accountDetails=new AccountDetails();
        accountDetails.fromAccountNumber="1234567";
        accountDetails.toAccountNumber="654322";
accountDetails.Balance=2000;
        accountDetails.tranferAmt=900;
        Service service=new Service();
        service.credit(accountDetails,3000);
         service.tranfer(accountDetails);
    }
}
