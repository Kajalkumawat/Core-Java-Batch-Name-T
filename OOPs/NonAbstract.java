//abstract class and make abstract method and non abstract method 
abstract class A {
    // non-abstract method :body define
    void show() {
        System.out.println("non abstract method ");
    }

    // abstract method
    abstract void show1();
}

class B extends A {
    void show1() {
        System.out.println(("show1"));
    }
}

public class NonAbstract {
    public static void main(String[] args) {
        B p = new B();
        p.show();
        p.show1();
    }
}