//can we make private method in interface : yes
interface A {
    private void show() {
        System.out.println("hello private");
    }

    default void show1() {
        show();
    }
}

class B implements A {

}

public class InterfaceConcept3 {
    public static void main(String[] args) {
        B p = new B();
        p.show1();
    }
}
