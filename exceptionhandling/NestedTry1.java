public class NestedTry1 {
    public static void main(String[] args) {
        try{ 
            try{ 
                int a=9/0;
                System.out.println(a);
            }
            catch(ArithmeticException ex){
                System.out.println("inner try block ");
            }
        }
        catch(Exception ex){
            System.out.println("outer try block");
        }
    }
}
