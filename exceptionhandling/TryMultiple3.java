public class TryMultiple3 {
    public static void main(String[] args) {
		try{
		    int a=2/0;
		    System.out.println(a);
		}
        catch(NumberFormatException ex){
            System.out.println("number format exception ");
        }
        catch(ArithmeticException ex){
            System.out.println("arithmetic exception ");
        }
        catch(Exception ex ){
            System.out.println("array index out of bound ");
        }
	}
}
