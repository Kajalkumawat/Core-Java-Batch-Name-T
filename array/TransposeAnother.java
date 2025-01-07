public class TransposeAnother{
     //print 2 D array 
     public static void printn(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
     } 
     //swap method 
     public static void swap(int a[][],int i,int j){
        int temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
     } 
     //transpose of the 2 D array 
     public static void transpose(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[i].length;j++){
                swap(a,i,j);
            }
        } 
        printn(a);
     } 
    public static void main(String[] args){
       
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        transpose(a);
    }
}