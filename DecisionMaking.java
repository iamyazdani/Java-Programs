import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(compareIfElse(a, b));
        sc.close();
    }
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if (a < b) {
            return "smaller";
        } else if (a > b) {
            return "greater";            
        } else {
            return "equal";
        }
    }
}
