class A {
    int a = 78; // instance variable

    void show() {
        int b = 89; // local variable
        System.out.println(a + " " + b);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
