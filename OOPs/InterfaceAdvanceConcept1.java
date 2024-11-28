interface A {
    class B {
        void show() {
            System.out.println("B class method");
        }
    }
}

class C extends A.B {
    void show1() {
        System.out.println("class");
    }
}

public class InterfaceAdvanceConcept1 {
    public static void main(String[] args) {
        C p = new C();
        p.show();
        p.show1();
    }
}
