package If_Else;
import java.util.Scanner;
public class ThreeNos {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("ENter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the third number:");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c) System.out.println(a+" is greatest");
            else System.out.println(c+" is greatest");
        }
        else{
            if(b>c) System.out.println(b+" is greatest");
            else System.out.println(c+ " is greatest");
        }

    }
    
}
