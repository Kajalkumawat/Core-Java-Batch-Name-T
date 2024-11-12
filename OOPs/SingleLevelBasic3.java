import java.util.*;

class A {
    // return and argument
    int show1(int a) {
        return a;
    }
}

class B extends A {
    // return and no argument
    int show2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        int a = sc.nextInt();
        return a;
    }
    B show3(){
        System.out.println("hi");
        return this;
    }
}

public class SingleLevelBasic3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        B p=new B();
        p.show1(a);
        p.show2();
    }
}
