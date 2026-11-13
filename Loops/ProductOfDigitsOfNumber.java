package Loops;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number:");
        int n = sc.nextInt();
        int product = 1;
        int lastDigit;
        while (n != 0) {
            lastDigit = n % 10;
            if (lastDigit == 0) {
                product *= lastDigit;
            }

            n /= 10;

        }
        System.out.println("The product of digits are:" + product);
    }
}
