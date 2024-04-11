import java.util.Scanner;

public class SumOfEvenOdd {
    public static void Sum(int num) {
        int evenSum = 0;
        int oddSum = 0;
        while (num != 0) {
            int LD = num % 10;
            if (LD % 2 == 0) {
                evenSum += LD;                
            } else {
                oddSum += LD;
            }
            num = num / 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Sum(num);
        sc.close();
    }
}
