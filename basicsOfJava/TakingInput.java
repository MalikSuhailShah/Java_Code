package basicsOfJava;

import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;

        double area = pi * radius * radius;
        System.out.println("The area of circle is " + area);

    }

}
