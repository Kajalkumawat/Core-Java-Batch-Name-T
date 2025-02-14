public class ThreadConstructor {
    public static void main(String[] args) {
        //thread constructor :
        //1. default 
        // Thread t1=new Thread();
        // t1.start();
        //2. runnable interface 
        //3.Thread t1=new Thread(String name);
        Thread t1=new Thread("thread is running ");
        //two way :
        //first way :
        String name=t1.getName();
        System.out.println(name);
        //second way 
        System.out.println(t1.getName());
    }
}
