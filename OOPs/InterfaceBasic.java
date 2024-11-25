interface A {
    // method :declare
    void show(); // internally (by default :public and abstract )
}

class B implements A {
    public void show() {
        System.out.println("interface implement ");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
