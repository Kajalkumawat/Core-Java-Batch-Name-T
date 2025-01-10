public class NestedTry2 {
    public static void main(String[] args) {
        try{  
            try{ 
                int a=9/0;
                System.out.println(a);
            }
            catch(NullPointerException ex){
                System.out.println("inner try block ");
            }
        }
        catch(ArithmeticException ex){
            System.out.println("outer try block");
        }
        System.out.println("rest of code ");
    }
}
