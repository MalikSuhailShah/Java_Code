package Method_Functions;

import java.util.*;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Enter the value of r:");
        int r = sc.nextInt();

        System.out.println(Combination(n,r));

    }

    public static int fact(int n) {
        int nfact = 1;
        if(n==0) return 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        return nfact;
    }

    public static int Combination(int a, int b) {

         if(a<b) return 0;

        int ncr = fact(a) / (fact(b) * fact(a - b));

        return ncr;
    }
}
