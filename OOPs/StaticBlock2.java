class A {
    A() {
        System.out.println("constructor call");
    }

    void show() {
        System.out.println("method");
    }

    {
        System.out.println("anonymous block ");
    }
    static {
        System.out.println("static block");
    }
}

public class StaticBlock2 {
    public static void main(String[] args) {
        new A().show();
    }
}