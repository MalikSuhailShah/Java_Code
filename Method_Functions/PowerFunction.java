package Method_Functions;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base:");
        int a = sc.nextInt();

        System.out.println("Enter the exponent:");
        int b = sc.nextInt();

        int powAns = 1;

        for (int i = 1; i <= b; i++) {
            powAns *= a;

        }

        if (a == 0 && b == 0)
            System.out.println("Not defined");
        else 
             System.out.println("The answer is " + powAns);
        
    }

}
