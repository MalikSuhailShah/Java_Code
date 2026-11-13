package If_Else;
import java.util.Scanner;

public class divisibleBY5Or3Not15 {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number:");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0)
        {
            if(n%15!=0){
                System.out.println("number divisible by 5 or 3 but not by 15");
            }
            else {
                System.out.println("Number divisible by 15");
            }
        }
        else{
            System.out.println("Conditions not matched");
        }


    }
    
}
