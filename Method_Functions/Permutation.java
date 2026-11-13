package Method_Functions;
import java.util.Scanner;
public class Permutation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n=sc.nextInt();

        System.out.println("Enter the value of r:");
        int r=sc.nextInt();

     System.out.println(Permutation(n,r)); 

    }
    public static int fact(int n){
        int nfact=1;
        if(n==0) return 1;
        for(int i=1;i<=n;i++){
            nfact*=i;
        }
        return nfact;
    }
    public static int Permutation(int a, int b)
    {
        int apb=fact(a)/fact(a-b);
        return apb;
    }
}
