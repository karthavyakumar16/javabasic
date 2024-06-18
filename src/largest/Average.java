package largest;

public class Average {
    public void avg(int m1,int m2,int m3,int m4,int m5){

        int avgerage=(m1+m2+m3+m4+m5)/5;
        System.out.println("Average is " +avgerage);
        if(avgerage>90){
            System.out.println("A grade");
        }else if(avgerage>=80&&avgerage<=90){
            System.out.println("B grade");
        }else if(avgerage>=70&&avgerage<=80){
            System.out.println("C grade");
        }

    }

    public static void main(String[] args) {
        Average average=new Average();
        average.avg(90,80,90,80,90);
    }
}
