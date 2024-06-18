package overridding;

public class Car {
    public String year;
    public int price=10000;

     public int discountprice(){
         int discount=100;
         return price-discount;
     }
}
