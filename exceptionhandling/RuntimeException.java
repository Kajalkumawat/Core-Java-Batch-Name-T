class A{
    void show() throws ArithmeticException{
        System.out.println("Parent class ");
    }
}
class B extends A{
    void show() throws Exception{
        System.out.println("Parent class ");
    }
}
public class RuntimeException {
    public static void main(String[] args) {
    B p=new B();
    p.show();
    }
}
