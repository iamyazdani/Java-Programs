import java.util.Scanner;

public class Functions {
    public static void Swap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " " + num2);
    }

    public static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;            
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:\n" + "1. Swapping of Numbers\n" + "2. Maximum of Numbers");
        int num = sc.nextInt();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        switch (num) {
            case 1:
                Swap(num1, num2);                
                break;
            case 2:
                System.out.println(findMaximum(num1, num2));
                break;
            default:
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
