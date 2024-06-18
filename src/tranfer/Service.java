package tranfer;

public class Service {
    public static double minBalance=1000;
    public AccountDetails tranfer(AccountDetails accountDetails){
        if(minBalance>accountDetails.tranferAmt){
            accountDetails.Balance=accountDetails.Balance- accountDetails.tranferAmt;

            System.out.println("tranfer sucessfull"+accountDetails.Balance);
        }else{
            System.out.println("transfer failed");
        }
return accountDetails;
    }
    public AccountDetails credit(AccountDetails accountDetails,double creditamount){
        if(creditamount>0){
            accountDetails.Balance=accountDetails.Balance+creditamount;
            System.out.println(accountDetails.Balance);
        }
        return accountDetails;
    }
}
