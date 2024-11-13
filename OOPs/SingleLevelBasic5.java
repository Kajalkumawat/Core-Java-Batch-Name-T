class A {
    protected int a = 9;
}

class B extends A {
    void show() {
        System.out.println(a);
    }
}

public class SingleLevelBasic5 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
