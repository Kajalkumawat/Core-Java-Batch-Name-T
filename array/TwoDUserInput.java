import java.util.*;
public class TwoDUserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("enter the cols");
        int cols=sc.nextInt();
        //create 2 d array 
        int a[][]=new int[row][cols];
        //first loop for input the 2 D array 
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter value");
                a[i][j]=sc.nextInt();
            }
        }
        //loop for output 
        for(int i=0;i<row;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
