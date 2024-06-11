package swiggy.service;

import swiggy.model.OTP;
import swiggy.model.User;

import java.util.Date;
import java.util.UUID;

public class OTPService {
    public User userInstance;
    public OTP otpInstance;
    public OTP generateOTP(User inputUser){
        userInstance=inputUser;
        OTP otp=new OTP();
        otp.number= UUID.randomUUID().toString();
        otp.creationDate=new Date();


        long currentTimeInMills=otp.creationDate.getTime();
        long endTimeMills=currentTimeInMills+900000;


        otp.expiryTime=new Date(endTimeMills);
        return otp;

    }
    String otpValidation(OTP inputOtp,User inputUser) {
        if (inputOtp.number.equals(otpInstance.number) && inputUser.moblieNumber.equals(otpInstance.mobileNumber)) {
          return ("validation sucessfull");
        } else {
           return ("in valid otp");
        }

    }
}
