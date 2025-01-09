public class Exceptions1Sovle {
    public static void main(String[] args) {
        try{ 
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException a){
            System.out.println("excpetion handle ");
        }
    }
}
