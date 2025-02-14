//create thread class 
class A extends Thread{
    //normal method 
    public void run(){
       for(int i=1;i<=3;i++){
        System.out.println("A class");
       }
    }
}
public class RunThread {
    public static void main(String[] args){
        A p=new A();
       p.run(); //normal method :no thread method 
       for(int i=1;i<=3;i++){
        System.out.println("main thread");
       }
    }
}
