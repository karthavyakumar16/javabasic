package studentmarks;

public class Service {
    public void result(Student student1) {
        for (Subjects subject : student1.subject) {
            if (subject.marks >= 35) {
                System.out.println(student1.name + "pass");
            } else {
                System.out.println("fail");
            }
        }
    }
}
