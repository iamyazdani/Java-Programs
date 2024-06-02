import java.util.Scanner;

class Computer {
    public int add(int num1, int num2) {
        return (num1 + num2);
    }
}

public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        Computer comp = new Computer();
        int result = comp.add(num1, num2);
        System.out.println("Sum of the two numbers: " + result);
        sc.close();
    }
}
