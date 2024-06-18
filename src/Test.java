import inhertancegeneric.Book;
import inhertancegeneric.ElectronicDevice;

public class Test {
    public static void main(String[] args) {
        Book book=new Book("database",300,"sunder");
        System.out.println(book.getName()+book.getPrice());

        ElectronicDevice electronicDevice=new ElectronicDevice("watch",500,"fasttrack");
        System.out.println(electronicDevice.getName()+electronicDevice.getPrice());
    }
}
