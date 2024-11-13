class A {
    private void show() {
        System.out.println("A class method ");
    }

    void show2() {
        A k = new A();
        k.show();
    }
}

class B extends A {
    private void show1() {
        System.out.println("B class method");
    }

    void show3() {
        B h = new B();
        h.show1();
    }
}

public class PrivateMethod {
    public static void main(String[] args) {
        B p = new B();
        p.show2();
        p.show3();
    }
}
