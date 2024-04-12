import java.util.Scanner;

public class Pattern3 {
    public static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printPattern(num);
        sc.close();
    }
}
