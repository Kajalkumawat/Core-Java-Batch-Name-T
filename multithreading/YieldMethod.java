class A extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("thread classs ");
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {
       A p=new A();
       p.start();
       for(int i=1;i<=3;i++) {
        //yield method is static method :part of thread class 
        Thread.yield();
        System.out.println("main method");
       }
    }
}
