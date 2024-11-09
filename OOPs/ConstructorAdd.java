class A {
    A() {
        int a = 1, b = 1, c;
        c = a + b;
        System.out.println(c);
    }
}

public class ConstructorAdd {
    public static void main(String[] args) {
        new A();
    }
}
