package plaining;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//    Node node=new Node();
//        List<Node> division=new ArrayList<>();
//        Node b=new Node();
//        Node c=new Node();
//        division.add(b);
//        division.add(c);
//        List<Node> department=new ArrayList<>();
//        Node e=new Node();
//        Node f=new Node();
//        department.add(e);
//        department.add(f);
//
//        List<Node> designation =new ArrayList<>();
//        Node g=new Node();
//        Node h=new Node();
//        designation.add(g);
//        designation.add(h);


        List<Node> departmentlist=new ArrayList<>();
        List<Node> designationlist=new ArrayList<>();

        Node division=new Node();
        division.type="excutive mangement";
        division.children=departmentlist;

        Node department=new Node();
        department.type="mangement office";
        department.children=designationlist;
        Node department2=new Node();
        department2.type="health safety";
        department2.children=designationlist;
        Node designation=new Node();
        designation.type="general maneger";
        Node designation2=new Node();
        designation2.type="hotel manager";

        departmentlist.add(department);
        departmentlist.add(department2);

        designationlist.add(designation);
        designationlist.add(designation2);
        System.out.println(division.children);
    }
}
