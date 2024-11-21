abstract class A {
    abstract void show();
}

abstract class B extends A {
    abstract void show1();
}

class C extends B {
    void show1() {
        System.out.println("hello");
    }

    void show() {
        System.out.println("hi");
    }
}

public class ConceptAbstract {
    public static void main(String[] args) {
        C p = new C();
        p.show();
        p.show1();
    }
}
