public class NestedTry5 {
    public static void main(String[] args) {
        try{ 
            try{ 
               int a=7/0;
               System.out.println(a); 
            }
            catch(NullPointerException ex){
                System.out.println("inner try");
            }
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException ex){
            System.out.println("outer try block ");
        }
    }
}
