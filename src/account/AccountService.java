package account;

public class AccountService {
    double balance;

    public double credit(String accountNumber,double amt){
        Account account=new Account();
        account.accountNumber="2345678";
        account.holderName="kk";
        account.ifscCode="3214";
        account.minBalance=1000;
        if(accountNumber.equals(account.accountNumber)){
           balance=account.minBalance+amt;
            System.out.println("balance"+balance);

        }else{
            System.out.println("wrong account number");
        }
        return balance;
    }

}