class A extends Thread{
     //normal method 
     public void start(){
        System.out.println("start method ");
    }
    //thread method :it always in inactive stage 
    public void run(){
        System.out.println("run method ");
    }
   
}
public class NormalStart {
    public static void main(String[] args) {
       A p=new A();
       p.start(); 
    }
}
