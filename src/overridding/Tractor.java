package overridding;

public class Tractor extends Car{
    public String company;

    public int dicountprice(){
        int discount=2000;
        return price-discount;
    }
}
