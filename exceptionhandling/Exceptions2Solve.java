public class Exceptions2Solve {
    public static void main(String[] args) {
        try{ 
            String s="abc";
        Integer a=Integer.parseInt(s);
        System.out.println(a);
        }
        catch(NumberFormatException ex){
            System.out.println("exception handle ");
        }
    }
}
