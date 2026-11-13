package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number:");
        int n = sc.nextInt();
        int original=n;
        int lastDigit;
        int revNumber = 0;
        while (n != 0) {
            revNumber *= 10;
            lastDigit = n % 10;
            revNumber += lastDigit;
            n/=10;

        }
        System.out.println("The reverse pf number is:" + revNumber);
        int sum=original+revNumber;
                System.out.println(sum);

    }

}
