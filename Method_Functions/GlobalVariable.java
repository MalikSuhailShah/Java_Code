package Method_Functions;

import java.util.Scanner;

public class GlobalVariable {
    static int i;// this is global variable means it can be accessed anywhere in the code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        i = 10;

        int i=10;// this 'i' variable is different from global variable
                 //this is the l ocal variable that can be accessed only in main funtion
        System.out.println(i);
        fun();
    }
    public static void fun(){
        i=20;//updation of global variable
        System.out.println(i+" ");
    }

}
