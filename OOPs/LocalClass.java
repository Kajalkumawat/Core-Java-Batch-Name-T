class A {
    void show() {
        class B {
            void h() {
                System.out.println("local inner class");
            }
        }
        new B().h();

    }

}

public class LocalClass {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
