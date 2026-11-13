package basicsOfJava;

public class SimpleInterest {
    public static void main(String []args)    {
        double principle=10000;
        double rate=5;
        double time=3;
        double SI=(principle*rate*time)/100;
        System.out.println("the simple interest on principle is "+SI);
    }
}
