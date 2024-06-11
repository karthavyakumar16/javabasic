package swiggy.service;

import swiggy.model.OTP;
import swiggy.model.Restaurant;
import swiggy.model.User;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {
    public static Restaurant restaurantStaticVariable;

    public OTP registerRestaurant(Restaurant restaurant){
        restaurantStaticVariable=restaurant;
        OTPService otpService=new OTPService();
        return otpService.generateOTP(restaurant.user);
    }

    public String validateOtp(OTP inputOtp, User user){
        OTPService otpService=new OTPService();
        return otpService.otpValidation(inputOtp,user);
    }

}
// public  OTP registerRestaurant(Restaurant rrr){
//        restaurantStaticVariable=rrr;
//        OTP otp=new OTP();
//
//
//        otp.number= UUID.randomUUID().toString();
//        otp.creationDate=new Date();
//
//
//        long currentTimeInMills=otp.creationDate.getTime();
//        long endTimeMills=currentTimeInMills+900000;
//
//
//        otp.expiryTime=new Date(endTimeMills);
//        return otp;
//
//
//   }
//    public void validate(OTP otp){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter otp ");
//        String enteredOtp = scanner.nextLine();
//        if (otp.number.equals(enteredOtp)){
//            System.out.println("Registration successful");
//
//        }else {
//            System.out.println("you have entered wrong otp, please try again");
//        }
//
//    }
//
//
//  Restaurant getRestaurant(Restaurant restaurantName){
//     Restaurant r1=new Restaurant();
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("enter restaruant name");
//      String name=scanner.nextLine();
//      if(restaurantName.name.equals(name)){
//          System.out.println("restaurant details :"+restaurantName);
//      }else{
//          System.out.println("no details found");
//      }
//
//        return r1;
//  }

