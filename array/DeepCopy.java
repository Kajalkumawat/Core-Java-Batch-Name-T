public class DeepCopy {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //copy array one to another 
        //clone method :class is Object class method 
        int b[]=a.clone(); 
        b[0]=98;
        printn(a);
        printn(b);
    }
}
