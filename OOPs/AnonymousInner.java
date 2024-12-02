//AnonymousInner.java
/* anonymous inner class implemented through abstract class and interface and it used the name (refrence) of the interface and abstract class  */
interface A {
    void show();
}

public class AnonymousInner {
    public static void main(String[] args) {
        // anonymous inner class
        A k = new A() {
            public void show() {
                System.out.println("anonymous inner class ");
            }
        };
        k.show();
    }
}