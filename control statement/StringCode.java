import java.util.*;

public class StringCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter one word");
        String name = sc.next();
        if (name.equals("apple")) {
            System.out.println("A");
        } else {
            System.out.println("not match");
        }
    }
}
