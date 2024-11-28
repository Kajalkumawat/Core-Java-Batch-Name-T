interface A {
    interface B {
        void show();
    }

    void show1();
}

class C implements A.B, A {
    public void show() {
        System.out.println("nested interface");
    }

    public void show1() {
        System.out.println("hii");
    }
}

public class InterfaceAdvanceConcept4 {
    public static void main(String[] args) {
        C p = new C();
        p.show();

        A.B k = new C();
        k.show();

        A l = new C();
        l.show1();
    }
}
