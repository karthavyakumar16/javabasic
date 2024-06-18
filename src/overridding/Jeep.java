package overridding;

public class Jeep extends Car {
    public String company;


    public int discountprice(){
        int discount=1000;
        return price-discount;
    }
}
