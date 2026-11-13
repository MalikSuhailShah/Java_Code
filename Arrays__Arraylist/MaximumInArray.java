package Arrays__Arraylist;
import java.util.Scanner;
public class MaximumInArray {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }

        int max=-1;

        for(int i=0;i<n;i++)
        {
            if(max<arr[i]) max=arr[i];
        }

        System.out.println("The maxima of the array is :"+max);

    }
    
}
