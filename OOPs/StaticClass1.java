class A {
    //inner class 
    class B {
        void show() {
            System.out.println("Hello World");
        }
    }
}

public class StaticClass1 {
    public static void main(String[] args) {
        // first way
        A.B a = new A().new B();
        a.show();
        // second way
        A k = new A();
        A.B p = k.new B();
        p.show();
    }
}
