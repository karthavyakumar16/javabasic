package largest;

public class Maxium {

    public void max(int a,int b,int c){
        if(a>b|| b>c){
            System.out.println("a is maxium");
        }else if(b>c){
            System.out.println("b is max");

        }else{
            System.out.println("c is max");
        }
    }

    public static void main(String[] args) {
        Maxium maxium=new Maxium();
        maxium.max(6,2,4);
    }
}
