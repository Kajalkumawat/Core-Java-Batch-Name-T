import java.util.*;

class A {
    A(int a) {
        System.out.println(a);
    }
}

public class ParameterConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        new A(a);
    }

}
