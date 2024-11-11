import java.util.*;

class A {
    int a;

    A(int a) {
        this.a = a;
    }

    void show() {
        System.out.println(a);
    }
}

public class InstanceVaraible4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        A p = new A(a);
    }
}
