package loops;

public class ForLoop {
    public static int factorial(int number){
        int fact=0;
        for(int i=1;i<=number;i++){

           fact=fact*i;

        }
        return fact;
    }

public static void main(String[] args) {
    System.out.println(ForLoop.factorial(7));
}
}
//public static void generateFibonacci(int n) {
//    int num1 = 0, num2 = 1;
//    System.out.print("Fibonacci Series of " + n + " numbers:");
//
//    for (int i = 1; i <= n; ++i) {
//        System.out.print(num1 + " ");
//        int nextNum = num1 + num2;
//        num1 = num2;
//        num2 = nextNum;
//    }