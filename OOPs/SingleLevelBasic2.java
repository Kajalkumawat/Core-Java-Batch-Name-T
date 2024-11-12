class A {
    void show1() {
        int a = 1, b = 1, c;
        c = a + b;
        System.out.println(c);
    }
}

class B extends A {
    void show2() {
        int a = 4, b = 2, c;
        c = a - b;
        System.out.println(c);
    }
}

public class SingleLevelBasic2 {
    public static void main(String[] args) {
        B p = new B();
        p.show1();
        p.show2();
    }
}
