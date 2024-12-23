import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class SortingBinaryTwoPointer {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int a[]){
        int left=0;
        int right=a.length-1;
        for(int i=0;i<a.length;i++){
            if(a[left]==1 && a[right]==0){
                swap(a,left,right);
               
            }
            else if(a[left]==0){
                left++;
            }
            else if(a[right]==1){
                right--;
            }
        }
      
    }
    public static void swap(int a[],int left,int right){
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }
    public static void main(String[] args) {
        int a[]={0 ,1, 1 ,0 ,1 ,0 ,0 ,1 };
        printn(a);
        sort(a);
        printn(a);
    }
}
