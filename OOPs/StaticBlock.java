class A {
    // static block access only static data members
    static {
        System.out.println("static block");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        new A();
    }
}
