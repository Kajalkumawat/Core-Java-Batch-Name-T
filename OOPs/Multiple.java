interface A {
    void show1();
}

interface B {
    void show2();
}

class C implements A, B {
    public void show1() {
        System.out.println("A interface implement");
    }

    public void show2() {
        System.out.println("B interface implement");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C p = new C();
        p.show1();
        p.show2();
    }
}
