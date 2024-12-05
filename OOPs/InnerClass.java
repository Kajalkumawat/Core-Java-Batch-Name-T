class A {
    class B {
        void show() {
            System.out.println("Hello WOrld");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A.B k = new A().new B();
        k.show();
    }
}