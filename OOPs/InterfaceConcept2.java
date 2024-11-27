interface A {
    // non abstract method :
    // java 8 feature :default keyword
    default void show() {
        System.out.println("non abstract method ");
    }
}

class B implements A {

}

public class InterfaceConcept2 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
