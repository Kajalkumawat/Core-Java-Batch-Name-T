class A {
    void show1() {
        System.out.println("A class");
    }
}

class B {
    void show2() {
        System.out.println("B class");
    }
}

class C {
    void show3() {
        System.out.println("C class");
    }
}

class D extends A,B,C{

    void show4() {
        System.out.println("D class");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        D p = new D();
        p.show1();
        p.show2();
    }
}