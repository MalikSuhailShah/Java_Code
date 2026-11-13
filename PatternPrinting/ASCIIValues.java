package PatternPrinting;
import java.util.Scanner;
public class ASCIIValues {
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        for(int i=65;i<=90;i++){
            char ch =(char)i;
            System.out.println(i+"->"+ch);
        }
        for(int i=97;i<=122;i++){
            char ch=(char)i;
            System.out.println(i+"->"+ch);
        }
    }
    
}
