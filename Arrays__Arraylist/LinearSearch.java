package Arrays__Arraylist;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");

        int n = sc.nextInt();

        System.out.println("Enter the elements of array:");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        boolean flag = false;
        System.out.println("Enter the key to search:");
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                        flag = true;
                        break;
                   }
            else
                flag = false;
        }

        if (flag)
            System.out.println("Eement is present");
        else
            System.out.println("Element not found");
    }

}
