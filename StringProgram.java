public class StringProgram {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Gulam");
        // To print the size of the StringBuffer when empty
        System.out.println(sb.capacity());
        // Find the length of the String
        System.out.println("The length of the String is: " + sb.length());
        System.out.println(sb.append(" Yazdani"));
    }
}
