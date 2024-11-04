public class Marksheet {
    public static void main(String[] args) {
        int mark = 78;
        if (mark >= 60 && mark <= 98) {
            System.out.println("A");
        } else if (mark >= 59 && mark <= 40) {
            System.out.println("B");
        } else {
            System.out.println("fail");
        }
    }
}
