import java.util.Arrays;

public class SortingPredefine {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int a[]={7,2,4,5,1,6};
    printn(a);
    //sorting 
    Arrays.sort(a);
    printn(a);
}
}
