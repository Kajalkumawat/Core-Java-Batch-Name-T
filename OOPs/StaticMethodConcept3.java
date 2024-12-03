class A {
    int a = 9;

    static void show() {
        System.out.println(a);
    }
}

public class StaticMethodConcept3 {
    public static void main(String[] args) {
       A.show();
    }
}