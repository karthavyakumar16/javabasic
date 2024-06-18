package largest;

public class Largest {

         public void larger(int number1,int number2){
             if(number1>number2){
                 System.out.println("print"+number1);
             }else{
                 System.out.println("print"+number2);
             }
         }

    public static void main(String[] args) {
        Largest largest=new Largest();
        largest.larger(25,15);
    }

    }

