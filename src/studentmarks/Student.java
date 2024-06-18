package studentmarks;

import java.util.Arrays;

public class Student {
    public String name;
    public Subjects[] subject;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
