public class FinallyBlock3 {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println("handle");
        }
        finally{
           try{
            String name=null;
            System.out.println(name.length());
           }
           catch(Exception ex){
            System.out.println("handles ");
           }
        }
    }
}
