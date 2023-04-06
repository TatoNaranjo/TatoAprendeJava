import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        try {
            long result = sc.nextLong();
        if(result <= 127)System.out.println("byte");
        else if(result <= 32767)System.out.println("short");
            else if(result <= 2147483647 ) System.out.println("int");
            else System.out.println("long");
        } catch (Exception e){
            System.out.println("BigInteger");
        }
        }

}
