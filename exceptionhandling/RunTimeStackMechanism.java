class A{
    void m(){
        int a=9/0;
        System.out.println(a);
    }
    void n(){
        m();
    }
    void p(){
       try{
        n();
       }
       catch(ArithmeticException ex){
        System.out.println("handle");
       }
    }
}
public class RunTimeStackMechanism {
    public static void main(String[] args) {
        A p=new A();
        p.p();
    }
}
