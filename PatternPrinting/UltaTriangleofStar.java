package PatternPrinting;
import java.util.Scanner;
public class UltaTriangleofStar {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;i+j<=n+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
