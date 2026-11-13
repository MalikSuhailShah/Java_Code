package Loops;
import java.util.Scanner;
public class EvenNos {
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<n;i+=2){
            System.out.println(i);
        }
    }
    
}
