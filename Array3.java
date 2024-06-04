public class Array3 {
    public static void main(String[] args) {
        String name = new String("Yazdani");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name.charAt(0));
        System.out.println("Length of the String: " + name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
        String firstName = "Gulam ";
        System.out.println(firstName.concat(name));
    }
}
