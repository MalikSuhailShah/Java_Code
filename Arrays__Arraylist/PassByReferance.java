package Arrays__Arraylist;
import java.util.Scanner;
public class PassByReferance {

    public static int[] Swap(int[] arr, int i, int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


        return arr;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        
        int [] arr={10,20};

         System.out.println(arr[0]+" "+arr[1]);

        Swap(arr,0,1);
        
        System.out.println(arr[0]+" "+arr[1]);

        
    }
    
}
