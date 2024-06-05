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
        Human human = new Human();
        // human.name = "Gulam";
        // human.age = 24;
        // System.out.println("Your name is: " + human.name.concat(" Yazdani"));
        // System.out.println("Your age is: " + human.age);
        
        human.getAge(24);
        System.out.println("Your name is: " + human.getName("Gulam").concat(" Yazdani"));
        System.out.println("Your age is: " + human.getAge(24));        
    }
}
