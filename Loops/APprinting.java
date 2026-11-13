package Loops;

import java.util.Scanner;

public class APprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of first term:");
        int a = sc.nextInt();

        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        System.out.println("ENter the value of common difference:");
        int d = sc.nextInt();

        for (int i = 1; i <= n; i++) {// we can iterate the value of i
            System.out.println(a);   // between first term and nth term
            a += d; 
        }
    }

}
