package PatternPrinting;
import java.util.Scanner;
public class UltaReverseTriangle {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();


    // METHOD 1
    //    for(int i=1;i<=n;i++)
    //    {
    //     for(int j=1;j<=i-1;j++){
    //         System.out.print("  ");
    //     }

    //     for(int j=1;j<=n-i+1;j++)
    //     {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    }

    //METHOD 2
    int nst=n;
    int nsp=0;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=nsp;j++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=nst;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
        nst--;
        nsp++;
    }
    }
    
}
