abstract class A {
    abstract protected void show();
}

class B extends A {
    protected void show() {
        System.out.println("hello world");
    }
}

public class ProtectedAbstract {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
