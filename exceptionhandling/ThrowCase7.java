class A extends RuntimeException{
    public A(int a){
        System.out.println(a); //no exception convert manulllay 
    }
}
public class ThrowCase7 {
    public static void main(String[] args){
        try { 
            //manullay exception create through thorw and create a custome exception 
            throw new A(78);
        } catch (Exception e) {
        }
    }
}
