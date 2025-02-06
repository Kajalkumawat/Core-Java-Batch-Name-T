//creation of runnable interface 
class A implements Runnable{
    //used run method 
    public void run(){
        System.out.println("thread is running ");
    }
}
public class RunnableInterface {
    public static void main(String[] args){
        A p=new A();
        //Thread t=new Thread(Runnable r);
        Thread t=new Thread(p); 
        t.start();
    }
}
