class A {
    // return and no argument
    int show() {
        int a = 9;
        return a;
    }

    // byte
    byte show1() {
        byte a = 98;
        return a;
    }
}

public class Basic4 {
    public static void main(String[] args) {
        A p = new A();
        // two way :
        // first
        System.out.println(p.show());
        // second
        int m = p.show();
        System.out.println(m);
        System.out.println(p.show1());
    }
}