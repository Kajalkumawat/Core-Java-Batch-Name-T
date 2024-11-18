class A {
    A(int a) {
        System.out.println("the value of a is :" + a);
    }

    A(float a) {
        System.out.println("the value of a :" + a);
    }
}

public class ConstructorOverloadingCase3 {
    public static void main(String[] args) {
        new A(78);
        new A(45.6f);
    }
}
