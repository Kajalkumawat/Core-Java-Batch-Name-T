class A{
    A show(){
        System.out.println("hello world");
        return this;
    }
    
}
public class Basic5 {
    public static void main(String[] args) {
        A p=new A();
        p.show();
       System.out.println(p.show());
    }
}
