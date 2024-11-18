class A {
    // methods
    int show(int a) {
        System.out.println("First Method " + a);
        return a;
    }

    void show(float a) {
        System.out.println("second Method " + a);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        A p = new A();
        p.show(78);
    }
}