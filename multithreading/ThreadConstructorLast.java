class A implements Runnable{
    public void run(){
        System.out.println("hello");
    }
}
public class ThreadConstructorLast {
    public static void main(String[] args) {
        //Thread t=new Thread(String s,Runnable r )
        A s=new A();
        Thread t=new Thread(s,"hello world");
        t.start();
        System.out.println(t.getName());
    }
}
