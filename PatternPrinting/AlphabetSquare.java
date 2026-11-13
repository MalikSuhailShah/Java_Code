package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the side of square:");
        int n=sc.nextInt();
            char ch ='a';
        for(int i=0;i<n;i++){
             
             char sh = 'A';
            for(int j=0;j<n;j++){
                System.out.print(sh+" ");
                sh++;
            }
            System.out.println();
        }

    }
}
