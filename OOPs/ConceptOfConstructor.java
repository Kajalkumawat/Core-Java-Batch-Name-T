abstract class A {
    void show1() {
        System.out.println("non abstract method ");
    }

    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("abstract nethod");
    }

    void show3() {
        System.out.println("B class method");
    }
}

public class ConceptOfConstructor {
    public static void main(String[] args) {
        // parent class refrence variable child class constructor
        A s = new B();
        s.show();
        s.show1();
    }
}
