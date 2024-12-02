class A {
    static void show() {
        System.out.println("hello world");
    }
}

public class StaticMethodConcept1 {
    public static void main(String[] args) {
        A p = new A();
        p.show();
        // short cut :
        A.show();
    }
}
