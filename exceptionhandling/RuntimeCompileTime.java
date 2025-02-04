class A{
    void show() throws ArithmeticException{
        System.out.println("arithmetic ");
    }
}
class B extends A{
void show() throws IOException{
        System.out.println("IOException");
    }
}
public class RuntimeCompileTime{
    public static void main(String[] args){
        B k=new B();
        try{
            k.show();
        }
        catch(Exception ex){
            System.out.println("handle");
        }
    }
}
//error 