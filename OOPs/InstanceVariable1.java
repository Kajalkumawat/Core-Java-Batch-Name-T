class A {
    int a;

    void show() {
        // instance variable stored default value
        System.out.println(a);
    }
}

public class InstanceVariable1 {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
