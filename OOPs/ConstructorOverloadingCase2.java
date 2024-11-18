class A {
    A() {
        System.out.println("call");
    }

    A(int a) {
        System.out.println("the value of a is : " + a);
    }
}

public class ConstructorOverloadingCase2 {
    public static void main(String[] args) {
        new A(56);
        new A();
    }
}
