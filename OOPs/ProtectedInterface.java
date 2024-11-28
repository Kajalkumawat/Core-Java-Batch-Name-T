interface A {
    protected void show(){
        System.out.println("hello world");
    }
}

class B implements A {
    public void show() {
        System.out.println("hi");
    }
}

public class ProtectedInterface {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}