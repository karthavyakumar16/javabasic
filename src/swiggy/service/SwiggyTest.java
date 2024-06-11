package swiggy.service;

import swiggy.model.Menu;
import swiggy.model.OTP;
import swiggy.model.Restaurant;

public class SwiggyTest {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();
        Menu menu=new Menu();
        restaurant.name="lucky";
        restaurant.flatNo="1-79";
        restaurant.area="greenhills";
        restaurant.pincode="507160";

        menu.name="fishcurry";
        menu.price=200;
        menu.status=true;


        restaurant.menu=menu;
        SwiggyService swiggyService =new SwiggyService();
     OTP testOTP= swiggyService.registerRestaurant(restaurant);
     String response=swiggyService.validateOtp(testOTP,restaurant.user);
       System.out.println(response);
       // System.out.println(swiggyService.registerRestaurant(restaurant));
//swiggyService.validate(r1);
//swiggyService.getRestaurant(restaurant);



    }
}
