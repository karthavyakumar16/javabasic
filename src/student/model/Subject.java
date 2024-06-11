package student.model;

public class Subject {
    public String subjectName;
    public  int marks;


    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
