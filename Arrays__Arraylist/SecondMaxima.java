package Arrays__Arraylist;
import java.util.Scanner;
public class SecondMaxima {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,55,66,77,5,3,56,7,8};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sec_max && arr[i]!= max )
            sec_max=arr[i];

        }
        System.out.println(sec_max);
    }
    
}
