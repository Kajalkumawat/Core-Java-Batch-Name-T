public class ShallowCopy {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int b[]=a;
        // printn(a);
        // printn(b);
        //changes array value 
        b[0]=90;
        printn(a);
        printn(b);
    }
}
