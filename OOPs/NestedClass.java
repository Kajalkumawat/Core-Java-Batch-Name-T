class A {
    static class B {
        static void show() {
            System.out.println("hello world");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        A.B.show();
    }
}
