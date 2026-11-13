package Loops;
import java.util.Scanner;
public class OddNOs {
    public static void main(String [] args){
        int  n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i+=1)
        {
            if(i%2!=0 && i%3==0){
                System.out.println(i);
            }
        }
    }
}
