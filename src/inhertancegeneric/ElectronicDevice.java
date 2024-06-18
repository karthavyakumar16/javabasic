package inhertancegeneric;

public class ElectronicDevice extends Product {
    public String brand;

    public ElectronicDevice(String name, double price,String brand) {
        super(name, price);
        this.brand=brand;
    }


    public String getName() {
        return "device"+brand+"by"+name;
    }

    public double getPrice() {
        return price;
    }

}
