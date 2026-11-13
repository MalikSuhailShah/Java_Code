package If_Else;

import java.util.Scanner;

public class StraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first point coordinates:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter  second point coordinates:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter  third point coordintes:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y3 - y2) / (x3 - x2);

        if (m1 == m2) {
            System.out.println("points belongs to same stright line");
        } else {
            System.out.println("the points do not belongs to the same straight line");
        }
    }

}
