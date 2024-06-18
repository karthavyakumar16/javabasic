package immutable;

public class Account {
    private String accountNumber;
    private int phoneNumber;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Account(String accountNumber, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.phoneNumber=phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
