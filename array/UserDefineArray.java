import java.util.*;

public class UserDefineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int size = sc.nextInt();
        int a[] = new int[size];
        // input array
        for (int i = 0; i < size; i++) {
            System.out.println("enter the value ");
            a[i] = sc.nextInt();
        }
        // output of the array : 
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
