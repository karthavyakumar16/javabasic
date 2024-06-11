package swiggy.model;

import java.util.Date;

public class OTP {
    public  String number;
    public Date expiryTime;
    public Date expiryDate;
    public Date creationDate;
    public String mobileNumber;

    @Override
    public String toString() {
        return "OTP{" +
                "number='" + number + '\'' +
                ", expiryTime=" + expiryTime +
                ", expiryDate=" + expiryDate +
                ", creationDate=" + creationDate +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
