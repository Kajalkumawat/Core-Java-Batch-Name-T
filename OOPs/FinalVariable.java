class A {
    final int a = 89;

    void show() {
        a=34;
        System.out.println(a);
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
