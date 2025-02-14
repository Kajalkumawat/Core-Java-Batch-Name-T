class A extends Thread{ 
    public void run(int a){
        System.out.println(a);
    }
    public void run(){
        System.out.println("thread method ");
    }
}
public class RunOverload {
    public static void main(String[] args) {
       A p=new A();
       p.start();
    }
}
