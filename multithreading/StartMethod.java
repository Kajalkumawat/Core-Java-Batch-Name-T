class A extends Thread{
    public void run(){
        System.out.println("thread class");
    }
}
public class StartMethod {
    public static void main(String[] args) {
       A p=new A();
       p.start();
       p.start(); 
    }
}
