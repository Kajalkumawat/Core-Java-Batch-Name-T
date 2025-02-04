class A{
    void show() throws ArithmeticException{
        System.out.println("parent class ");
    }
}
class B extends A{
    void show() throws ArithmeticException{
        super.show();
        System.out.println("child class ");
    }
}
public class RuntimeRuntime {
    public static void main(String[] args){
        B p=new B();
        p.show();
    }
}
