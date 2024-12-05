class A {
    A() {
        System.out.println("constructor call");
    }

    {
        System.out.println("anonymous block");
    }
    static {
        System.out.println("static block ");
    }
}

public class StaticBlock1 { 
    public static void main(String[] args) {
        new A();
    } 
}
