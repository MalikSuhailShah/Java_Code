package If_Else;
import java.util.Scanner;
public class PointOnAxis {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the coordinates of point:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("point is origin");
        }
        else if(x==0){
            System.out.println("point lies on Y-axis");
        }
        else if(y==0) {
            System.out.println("Point lies on X-axis ");
        }
        else {
            System.out.println("conditions are not matched");
        }
    }
}
