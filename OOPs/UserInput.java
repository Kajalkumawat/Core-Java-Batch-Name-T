import java.util.*;

abstract class A {
    abstract void show(int a); 

    void hello() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value ");
        int a = sc.nextInt();
        System.out.println(a);
    }
}

class B extends A {
    void show(int a) {
        System.out.println("B class " + a);
    }
}

public class UserInput { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt(); 
        B p = new B(); 
        p.show(a);
        p.hello();
    } 
}