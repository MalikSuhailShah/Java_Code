package Loops;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        int sum = 0;
        int ld;
        while (n != 0) {
            ld = n % 10;
            sum += ld;
            n /= 10;
        }
        System.out.println("The sum of digits of number are:" + sum);

    }

}
