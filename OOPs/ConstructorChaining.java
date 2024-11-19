class A {
    A() {
        System.out.println("constructor call");
    }

    A(int a) {
        this();
        System.out.println("the value of a is :" + a);
    }

    A(int a, int b) {
        this(6);
        System.out.println("the value of a and b " + a + b);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new A(1,2);
    }
}