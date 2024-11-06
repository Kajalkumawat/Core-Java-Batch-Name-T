class A {
    int add() {
        int a = 1, b = 1, c;
        c = a + b;
        return c;
    }
}

public class Basic6 {
    public static void main(String[] args) {
        A p = new A();
        System.out.println(p.add());
    }
}
