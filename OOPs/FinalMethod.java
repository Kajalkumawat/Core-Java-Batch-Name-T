class A {
    final void show() {
        System.out.println("A class method");
    }
}

class B extends A {
    final void show() {
        System.out.println("B class method");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
