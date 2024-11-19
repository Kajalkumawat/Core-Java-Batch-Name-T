//method name sameand class name diffrent but return type of method diffrent 
class A {
    void show() {
        System.out.println("hello");
    }
}

class B extends A {
    int show() {
        int a = 9;
        System.out.println(a);
        return a;
    }
}

public class MethodOverridingcase2 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
