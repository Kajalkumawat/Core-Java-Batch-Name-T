public class TryMultiple{
    public static void main(String[] args){
        try{
            int a=7/0;
            System.out.print(a);
        }
        catch(ArrayIndexOutOfBoundsException ex ){
            System.out.println("array index out of bound ");
        }
        catch(NumberFormatException ex){
            System.out.println("number format exception ");
        }
        catch(ArithmeticException ex){
            System.out.println("arithmetic exception ");
        }
    }
}
