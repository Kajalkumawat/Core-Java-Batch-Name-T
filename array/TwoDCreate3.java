public class TwoDCreate3{
    public static int[][] display(int a[][]){
        return a;
    }
    public static void printn(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{6,7,8,56}};
        //2 array stored : 
        int b[][]=display(a);
        printn(b);
    }
}