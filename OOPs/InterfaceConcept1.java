//interface does not create constructor in a code 

interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("B class");
    }
}

public class InterfaceConcept1 {
    public static void main(String[] args) {
        A s = new B();
        s.show();
    }
}
