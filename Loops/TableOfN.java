package Loops;

import java.util.Scanner;

public class TableOfN {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENter the value of n:");
        n=sc.nextInt();
        System.out.println("the table of "+ n+" is :");
        for(int i=n;i<=n*10;i+=n){
            System.out.println(i);
        }
    }

}
