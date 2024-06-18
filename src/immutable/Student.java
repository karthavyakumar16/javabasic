package immutable;

public class Student {
    private String name;
    private String fatherName;
    private String motherName;

    public Student(String name,String fatherName,String motherName) {
        this.name = name;
        this.fatherName=fatherName;
        this.motherName=motherName;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }
}
