package account;

public class AccountTest {
    public static void main(String[] args) {
        AccountService accountService=new AccountService();
        accountService.credit("2345678",1500);

    }
}
