public class Vowel {
    public static void main(String[] args) {
        char a[] = { 'w', 'e', 'i', 'o', 't', 'p' };
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                System.out.println(a[i]);
            }
        }
    }
}
