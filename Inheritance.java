class A {
    public A() {
        System.out.println("I'm in A");
    }

    public int add1(int num1, int num2) {
        return (num1 + num2);
    }
}

class B {
    public B() {
        System.out.println("I'm in B");
    }

    public int add2(int num1, int num2, int num3) {
        return (num1 + num2 + num3);
    }
}

class C extends A {
    public C() {
        System.out.println("I'm in C");
    }

    public void add(int n1, int n2) {
        System.out.println("Addition of the two numbers: " + (n1 + n2));
    }

    public void add(int n1, int n2, int n3) {
        System.out.println("Addition of three numbers: " + (n1 + n2 + n3));
    }
}


public class Inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.add(12, 16, 248);    
    }
}
