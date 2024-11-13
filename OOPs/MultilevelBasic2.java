class A {
    private int a;

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }
}

class B extends A {
    private int b;

    void setB(int b) {
        this.b = b;
    }

    int getB() {
        return b;
    }
}

class C extends B {
    private int c;

    void setC(int c) {
        this.c = c;
    }

    int getC() {
        return c;
    }
}

public class MultilevelBasic2 {
    public static void main(String[] args) {
        C p = new C();
        p.setA(56);
        p.setB(78);
        p.setC(12);
        System.out.println(p.getA());
        System.out.println(p.getB());
        System.out.println(p.getC());
    }
}
