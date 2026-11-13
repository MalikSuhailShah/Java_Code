package basicsOfJava;

import java.util.*;

public class TakingInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vaue of x:");
        int x = sc.nextInt();
        System.out.print("Enter the value of y:");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + sum);

    }
}
