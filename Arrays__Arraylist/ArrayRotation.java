package Arrays__Arraylist;

import java.util.Scanner;

public class ArrayRotation {
    public int[] Reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotation
        System.out.println("Enter the number of rotation:");
        int a = sc.nextInt();
        if(a>arr.length) a=a%n;

       for(int i=0,j=a-1;i<=j;i++,j--){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
       }


        for(int i=0,j=n-1;i<=j;i++,j--){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
       }

       System.out.println("The rotated array is:");
       for(int i=0;i<n;i++)
       {
        System.out.print(arr[i] + " ");
       }

    }

}
