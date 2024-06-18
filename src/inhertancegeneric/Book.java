package inhertancegeneric;

public class Book extends Product{
    public String author;

    public Book(String name, double price,String author) {
        super(name, price);
        this.author=author;

    }
    public String getName() {
        return "book"+name+"by"+author;
    }

    public double getPrice() {
        return price;
    }

}
