public class NestedTry3 {
    public static void main(String[] args) {
        try{ 
            String s=null;
            System.out.println(s.length());
            int b=7/0;
            System.out.println(b);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
}
