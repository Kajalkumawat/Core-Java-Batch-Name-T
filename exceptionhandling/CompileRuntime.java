class A{
    void show() throws IOExcpetion{
        System.out.println("parent class ");
    }
}
class B extends A{
    void show() throws ArithmeticException{
        try{
            super.show();
        }
        catch(Exception ex){

        }
        System.out.println("child class");
    }
}
public class CompileRuntime {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
