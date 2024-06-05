import java.util.Scanner;

class Human {
    private int age;
    private String name;

    public int getAge(int a) {
        age = a;
        return age;
    }
    public String getName(String n) {
        name = n;
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age in yrs: ");
        int age = sc.nextInt();
        Human human = new Human();
        System.out.println("Your name is: " + human.getName(name));
        System.out.println("You are " + human.getAge(age) + " years old");
        sc.close();        
    }
}
