interface A {
    final int a = 89;
}

class B implements A {
    void show() {
        a=67;
        System.out.println(a);
    }
}

public class InterfaceInstance {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
