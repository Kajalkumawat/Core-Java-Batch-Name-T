//create exception class userdefine another classs used 
class A extends Exception{
    public A(String name){
        System.out.println(name);
    }
}
class B {
    public static void voterid(int age){
        if(age<18){
            //exception throw 
           try{
            throw new A("invalid");
           }
           catch(A ex){
            System.out.println("handle");
           }
        }
        else{
            System.out.println("vaalid");
        }
    }
}
public class ThrowCase9 {
    public static void main(String[] args) {
        B.voterid(5);
    }
}
