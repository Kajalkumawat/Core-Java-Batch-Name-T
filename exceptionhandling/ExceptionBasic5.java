public class ExceptionBasic5 {
    public static void main(String[] args) {
       try{ 
        String name=null;
        System.out.println(name.length());
       }
       catch(Exception ex){
        System.out.println("exception handle");
        System.out.println(ex);
       }
    }
}
