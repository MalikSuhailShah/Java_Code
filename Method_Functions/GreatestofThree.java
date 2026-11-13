package Method_Functions;
import java.util.Scanner;
public class GreatestofThree {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three numbers:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
