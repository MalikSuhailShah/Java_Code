package Loops;
import java.util.Scanner;
public class HelloN {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=1;i<=n;i=i+1)
        {
            System.out.println("Hello World");
        }
    }
}
