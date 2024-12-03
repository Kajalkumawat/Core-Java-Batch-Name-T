class A {
    static class B {
        static void show() {
            System.out.println("static method");
        }
    }
}

public class StaticClass2 {
    public static void main(String[] args) {
        A.B.show();
    }
}
