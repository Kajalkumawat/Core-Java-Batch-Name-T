public class FinallyBlock2 {
    public static void main(String[] args){
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println("exception handle");
        }
        finally{
            System.out.println("finally block executed ");
        }
        System.out.println("rest ofd code");
    }
}
