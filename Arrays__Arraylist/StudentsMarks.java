package Arrays__Arraylist;

import java.util.Scanner;

public class StudentsMarks {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n=sc.nextInt();


        int[] arr =new int[n];

        System.out.println("Enter the marks of students :");
        
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]<33)  System.out.println("fail Roll No."+ i+" ");
        }


    }
    
}
