class A {//singleton class -->make object inside the class this is known as singlton class 
    private A() {
        System.out.println("private constructor ");
    }
    static void show(){
        new A();
    }
}

public class SingletonDesign {
    public static void main(String[] args) {
        A.show();
    }
}
