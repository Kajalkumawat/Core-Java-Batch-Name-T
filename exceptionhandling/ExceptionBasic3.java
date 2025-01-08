public class ExceptionBasic3 {
    public static void main(String[] args) {
        try{ 
            int a=4/0;
            System.out.println(a);
        }
        catch(ArithmeticException ex){
            System.out.println("handle");
        }
        System.out.println("rest of code ");
    }
}
