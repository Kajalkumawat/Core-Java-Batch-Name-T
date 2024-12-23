public class SortZeroAndOne {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void SortedBinaryNumber(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(i<count){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={0 ,1, 1 ,0 ,1 ,0 ,0 ,1 };
        printn(a);
        SortedBinaryNumber(a);
        printn(a);
    }
}
