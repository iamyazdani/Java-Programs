import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ch = sc.nextInt();
        double[] a = new double[10];
        a[0] = sc.nextDouble();
        a[1] = sc.nextDouble();
        System.out.println(areaSwitchCase(ch, a));
        sc.close();
    }
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        final double PI = Math.PI;
        switch(ch) {
            case 1:
            return (Math.round(PI * a[0] * a[0] * 100000d)/100000d);
            case 2:
            return (a[0] * a[1]);
            default:
            return 0;
        }
    }
}
