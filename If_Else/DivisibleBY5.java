package If_Else;
import java.util.Scanner;

public class DivisibleBY5 {
    public static void main (String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        if(n%5==0) System.out.println("number divisible by 5");
        else System.out.println("number not divisible by 5");
    }

    //number divisible by 5 or 3 but not by 15

    
    
}
