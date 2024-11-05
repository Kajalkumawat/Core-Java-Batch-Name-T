import java.util.*;

class A {
    // no return and no argument
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
    void add1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}

public class Basic2 {
    public static void main(String[] args) {
        A p = new A();
        p.add();
        p.add1();
    }
}
