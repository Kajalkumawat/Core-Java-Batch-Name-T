class A {
    A() {
        System.out.println("A class constructor ");
    }
}

class B extends A {
    B() {
        System.out.println("B class constructor ");
    }
}

public class DefaultSingle {
    public static void main(String[] args) {
        new B();
    }
}
