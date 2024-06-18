package overridding;

public class Test
{
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.discountprice());
        Jeep jeep=new Jeep();
        System.out.println(jeep.discountprice());
        Tractor tractor=new Tractor();
        System.out.println(tractor.dicountprice());
    }
}
