package PatternPrinting;
import java.util.Scanner;
public class ZeroOneTriangle {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of rows:");
        int n=sc.nextInt();

        //METHOD 1
    //    int a;
    // for(int i=1;i<=n;i++){
    //     if(i%2==0) a=0 ;
    //     else a=1;
    //     for(int j=1;j<=i;j++){
    //         System.out.print(a+" ");
    //         if(a==0) a=1;
    //         else a=0;
    //     }
    //     System.out.println();
    // }
    //METHOD 2
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2!=0)  System.out.print(1+" ");
            else System.out.print(0+" ");
        }
                    System.out.println();

    }


    }

    
}
