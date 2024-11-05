import java.util.*;

class A {
    void show(int a, int b) {
        System.out.println(a + b);
    }
}

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        A l = new A();
        l.show(a, b);
    }
}
