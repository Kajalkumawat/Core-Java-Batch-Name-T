import java.util.*;

abstract class A {
    abstract int show(int a);
}

public class AnonymousAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        A p = new A() {
            int show(int a) {
                System.out.println("abstract class" + a);
                return a;
            }
        };
        p.show(a);
    }
}
