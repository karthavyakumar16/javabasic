package studentmarks;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="kk";
        Subjects[] subjects=new Subjects[6];
        subjects[0]=new Subjects();
        subjects[0].subjectName="telugu";
        subjects[0].marks=70;

        subjects[1]=new Subjects();
        subjects[1].subjectName="telugu";
        subjects[1].marks=70;

        subjects[2]=new Subjects();
        subjects[2].subjectName="telugu";
        subjects[2].marks=70;

        subjects[3]=new Subjects();
        subjects[3].subjectName="telugu";
        subjects[3].marks=70;

        subjects[4]=new Subjects();
        subjects[4].subjectName="telugu";
        subjects[4].marks=70;

        subjects[5]=new Subjects();
        subjects[5].subjectName="telugu";
        subjects[5].marks=70;

        student.subject=subjects;
        Service service=new Service();
        service.result(student);
    }
}
