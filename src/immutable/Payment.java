package immutable;

public class Payment {
    private Account fromAccount;
    private Account toAccount;
    private double amt;
    private int phoneNumber;

    @Override
    public String toString() {
        return "Payment{" +
                "fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", amt=" + amt +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Payment(Account fromAccount, Account toAccount, double amt) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amt = amt;
    }
    public Payment(int phoneNumber,double amt){
this.phoneNumber=phoneNumber;
this.amt=amt;

    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public Account getFromAccount() {
        return this.fromAccount;
    }

    public Account getToAccount() {
        return this.toAccount;
    }

    public double getAmt() {
        return this.amt;
    }
}
