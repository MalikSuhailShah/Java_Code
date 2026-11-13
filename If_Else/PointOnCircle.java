package If_Else;

import java.util.*;

public class PointOnCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates of point:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter the center coordinates:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("enter the radoius of circle:");
        int r = sc.nextInt();

        int d = (x - a) * (x - a) + (y - b) * (y - b);

        if (d > r * r) {
            System.out.println("point lies outside of the circle");
        } 
        else if (d < r * r) {
            System.out.println("point lies inside of the circle");
        } 
        else {
            System.out.println("point lies on the circle");
        }

    }
}
