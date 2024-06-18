package inhertancegeneric;

public class Test {
    public static void main(String[] args) {
        Book book=new Book("database",300,"baghi");
        System.out.println(  book.getName()+book.getPrice());
        ElectronicDevice electronicDevice=new ElectronicDevice("watch",500,"fasttrack");
        System.out.println(electronicDevice.getPrice()+electronicDevice.getName());

    }
}
