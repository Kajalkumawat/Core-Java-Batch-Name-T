class A {
    int a;
    int b;

    void setA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getA() {
        return a;
    }

    int getA1() {
        return b;
    }

    void add() {
        System.out.println(a + b);
    }
}

public class GetterAndSetterAdd {
    public static void main(String[] args) {
        A p = new A();
        p.setA(1, 1);
        p.getA();
        p.getA1();
        p.add();
    }
}
