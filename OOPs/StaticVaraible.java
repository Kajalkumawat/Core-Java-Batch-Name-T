class A {
    // it provide one time memory in a code
    static int a = 0; // class variable

    A() {
        System.out.println(a);
        a++;
    }
}

public class StaticVaraible {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
    }
}
