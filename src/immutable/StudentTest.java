package immutable;

public class StudentTest {
    public static void main(String[] args) {

        Student student=new Student("A","b","c");
        Student student1=new Student("d","e","f");

        System.out.println(student.getName());
        System.out.println(student.getFatherName());
        System.out.println(student.getMotherName());

    }
}
