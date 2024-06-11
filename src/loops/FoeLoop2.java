package loops;

public class FoeLoop2 {
    static void fibonacci(int number) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        //return n;
    }

    public static void main(String[] args) {
        int number = 10;
        fibonacci(10);
    }
}
