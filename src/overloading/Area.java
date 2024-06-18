package overloading;

public class Area {





    public int area1(int length){
      int areaofsquare=length*length;
      return areaofsquare;

    }
    public int area1(int length,int breath){
        int areaofrectangle=length*breath;
        return areaofrectangle;
    }

    public static void main(String[] args) {
        Area area=new Area();
        System.out.println( area.area1(34));
        System.out.println(area.area1(34,45));
    }
}
