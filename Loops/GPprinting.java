package Loops;
import java.util.Scanner;
public class GPprinting {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term:");
        int a=sc.nextInt();
        System.out.println("enter the common ratio:");
        int r=sc.nextInt();
        System.out.println("ENter the number of terms:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            a*=r;
        }
    }
    
}
