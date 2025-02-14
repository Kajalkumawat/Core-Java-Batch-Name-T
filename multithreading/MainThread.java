class A extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("class thread ");
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        A p = new A();
        p.start();
        // execute main method thread
        for (int i = 1; i <= 3; i++) {
            System.out.println("main thread ");
        }
    }
}