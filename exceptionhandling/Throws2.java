public class Throws2 {
    static void show() throws  ArithmeticException{
        throw new ArithmeticException("handle");
    }
    public static void main(String[] args) {
        show();
    }
}
