public class ExceptionMethod2 {
   public static void main(String[] args) {
    try{ 
        int a=8/0;
        System.out.println(a);
    }
    catch(ArithmeticException ex){
       System.out.println(ex.toString());
    }
   } 
}
