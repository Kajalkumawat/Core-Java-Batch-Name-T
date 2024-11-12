class A {
    int a = 67;
}

class B extends A {
    void show() {
        System.out.println("the value of a is " + a);
    }
}

public class SingleLevelBasic4 { 
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
