package If_Else;

import java.util.Scanner;

public class SPCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling price:");
        int sp = sc.nextInt();
        System.out.println("Enter the cost price:");
        int cp = sc.nextInt();

        if (sp < cp) {
            System.out.print("Loss occur = ");
            System.out.print(cp - sp);
        } else {

            System.out.print("profit occur = ");
            System.out.println(sp - cp);
        }
    }

}
