package largest;

public class positive {
    public void postive(int n) {

        if (n > -1) {

            if (n > 0) {

                System.out.println("+ve");
            } else {
                System.out.println("-ve");
            }
        } else {
            System.out.println("enter correct number");
        }
    }

    public static void main(String[] args) {
        positive positive = new positive();
        positive.postive(2);
    }
}