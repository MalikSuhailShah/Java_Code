package Loops;
import java.util.Scanner;
public class NUmberPrinmeOrNot {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int n=sc.nextInt();

        boolean flag = false;// false means prime number

        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                flag=true;
                break;
            }
        }

        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag==true){
            System.out.println("The number is composite");
        }
        else{
            System.out.println("The number is prime");
        }

        //Method 2
     // if there is no factor exist of n before SQRT of n then number will be prime
         for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0){
                flag=true;
                break;
            }
        }

        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag==true){
            System.out.println("The number is composite");
        }
        else{
            System.out.println("The number is prime");
        }
        //3rd method
        int nf=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) nf++;
        }
        
        if(n==1) System.out.println("Neither prime nor composite");
        else if(nf>2){
            System.out.println("The number is composite");
        }
        else{
            System.out.println("The number is prime");
        }
    }
    
}
