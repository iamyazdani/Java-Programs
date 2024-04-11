import java.util.Scanner;

public class Fibonacci {
    public static int printFibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            int a = 1, b = 1, c = 0;
            for (int i = 3; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(printFibonacci(num));
        sc.close();
    }
}
