package PatternPrinting;
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String [] args){

        //* * * * * 
        //* * * * * 
        //* * * * *  for n=5 & m=5;
        //* * * * * 
        //* * * * * 
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();

        System.out.print("Enter the number of columns:");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
