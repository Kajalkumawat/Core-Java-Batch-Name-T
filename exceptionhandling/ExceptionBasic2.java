public class ExceptionBasic2 {
    public static void main(String[] args) {
        try{ 
            int a=4/2;
            System.out.println(a);
        }
        catch(ArithmeticException ex){
            System.out.println("handle");
        }
    }
}
