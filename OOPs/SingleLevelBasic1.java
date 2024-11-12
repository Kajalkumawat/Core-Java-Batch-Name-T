class A {// normal class convert parent
    void show1() {
        System.out.println("A class method");
    }
}

class B extends A {// normal convert child
    void show2() {
        System.out.println("B class method");
    }
}

public class SingleLevelBasic1 {
    public static void main(String[] args) {
        B k = new B();
        k.show1();
        k.show2();
    }
}
