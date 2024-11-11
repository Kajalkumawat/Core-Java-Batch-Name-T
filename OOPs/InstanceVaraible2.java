class A {
    int a;

    void show(int a) {
        this.a = a;
        System.out.println(a);
    }
}

public class InstanceVaraible2 {
    public static void main(String[] args) {
        A p = new A();
        p.show(56);
    }
}
