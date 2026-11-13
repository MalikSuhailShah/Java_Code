package If_Else;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the integer:");
        int n=sc.nextInt();
        if(n<0) System.out.println("the absolute value of integer is "+ (-1)*n);
        else System.out.println("the absolute value of integer is "+n);

    }
}
