public class FinallyBlock1{
    public static void main(String[] args){
        try{
            int a=9/0;
            System.out.println(a);
        }
        finally{
            System.out.println("always executed block ");
        }
        System.out.println("rest of code ");
    }
}