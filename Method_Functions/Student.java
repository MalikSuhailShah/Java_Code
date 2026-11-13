package Method_Functions;
import java.util.Scanner;
public class Student {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        Bio(22,"Rahul",'A',"12th Standard");

    }

    public static void Bio(int age, String name, char grade,String clas){
        System.out.println("Hello "+ name+" your age is "+ age + " years and  you belongs to " + clas + " and you got grade "+ grade);

    }
}
