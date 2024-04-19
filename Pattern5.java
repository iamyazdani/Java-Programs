import java.util.Scanner;

public class Pattern5 {
    public static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i+1; j++) {
                System.out.print("*" + " ");
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
