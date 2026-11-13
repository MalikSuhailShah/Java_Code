package Method_Functions;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows:");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){

            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(Combination(i, j) +"   ");
            }
            System.out.println();
        }
    }

    public static int fact(int n) {
        int nfact = 1;
        if (n == 0)
            return 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        return nfact;
    }

    public static int Combination(int a, int b) {

        int acb = (fact(a)) / (fact(b) * fact(a - b));
        return acb;
    }
}
