public class NestedTry4 {
   public static void main(String[] args) {
    try{ 
        int a[]=new int[5];
        //assignment operator :right to left move 
        a[5]=6/0;
        System.out.println(a[4]);
    }
    catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("exception handle");
    }
    System.out.println("rest of code ");
   } 
}
