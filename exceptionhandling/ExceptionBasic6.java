public class ExceptionBasic6 {
    public static void main(String[] args) {
        try{ 
         String name=null;
         System.out.println(name.length());
        }
        catch(RuntimeException ex){
         System.out.println("exception handle");
         System.out.println(ex);
        }
     } 
}
