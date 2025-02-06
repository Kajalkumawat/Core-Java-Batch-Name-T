class A extends Thread{
    public void run(){
        System.out.println("thread is in running stage");
    }
}
public class CreateThread{
    public static void main(String[] args){
        A s=new A();
        //thread run method inactive stage is convert active stage 
        s.start();
    }
}