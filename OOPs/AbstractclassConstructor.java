abstract class A {
    A() {
        System.out.println("hello");
    }
}

class B extends A {
    B() {
        System.out.println("world");
    }
}

public class AbstractclassConstructor {
    public static void main(String[] args) {
    //make constructor in abstract class constructor and does not call the constructor 
        new B();
    }
}
