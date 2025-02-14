class A extends Thread{
    public void run(){
        System.out.println("parent class");
    }
}
class B extends A{
    public void run(){
       super.start();//illegal thread state exception 
        System.out.println("child class");
    }
}
public class RunOverride {
    public static void main(String[] args) {
        B p=new B();
        p.start();
    }
}
