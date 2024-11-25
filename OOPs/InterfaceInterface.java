interface A {
    void show1();
}

interface B extends A {
    void show2();
}

class C implements B {
    public void show2() {
        System.out.println("b interface");
    }

    public void show1() {
        System.out.println("A interface");
    }
}

public class InterfaceInterface {
    public static void main(String[] args) {
        C k = new C();
        k.show1();
        k.show2();
    }
}
