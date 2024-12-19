public class Armstrong {
    public static void main(String[] args) {
        int a[] = { 153, 678 };
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int temp = num, rem, sum = 0;
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem * rem * rem;
                num = num / 10;
            }
            if (temp == sum) {
                System.out.println(a[i]);
            }
        }
    }
}