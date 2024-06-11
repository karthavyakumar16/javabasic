package arthemetic;

public class Arthemetic {
    public int a=2;
    public int b=4;
    public int c;

    @Override
    public String toString() {
        return "Arthemetic{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int add(){
        c=a+b;
        return c;
    }
    public int sub(){
        c=a-b;
        return c;
    }
    public int mul(){
        c=a*b;
        return c;
    }
    public int div(){
        c=a/b;
        return c;
    }

    public static void main(String[] args) {
        Arthemetic arthemetic1=new Arthemetic();

        System.out.println("the value of addition is"+arthemetic1.add());
        System.out.println("the value of sub"+arthemetic1.sub());
        System.out.println("the value of mul"+arthemetic1.mul());
        System.out.println("the value of div"+arthemetic1.div());



    }

}


