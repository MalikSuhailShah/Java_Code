package Loops;

import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the number:");
        int n=sc.nextInt();


        int count=0;

        
        if(n==0) count++;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("The number of digits are:"+count);
    }
}
