class A {
    static class B {
        void show() {
            System.out.println("hello");
        }
    }
}

public class StaticClass3 {
    public static void main(String[] args) {
        A p = new A();
        A.B k = p.new B();
        k.show();
    }
}
