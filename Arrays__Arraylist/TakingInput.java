package Arrays__Arraylist;
import java.util.Scanner;
public class TakingInput {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        
        System.out.println("Enter the elemets of array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
       
        System.out.println(" The Elements of the array are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    
    }
    
}
