class A {
    int a;

    void show(int k) { // int k : local variable
        a = k;
        System.out.println(a);
    }
}

public class InstanceVariable2 {
    public static void main(String[] args) {
        A p = new A();
        p.show(67);
    }
}
