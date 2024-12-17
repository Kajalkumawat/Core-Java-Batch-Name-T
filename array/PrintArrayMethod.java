public class PrintArrayMethod {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 45, 76, 22, 43, 87, 54 };
        printArray(a);
        int b[] = { 45, 232, 4, 3, 423, 4235, 342 };
        printArray(b);
    }
}


