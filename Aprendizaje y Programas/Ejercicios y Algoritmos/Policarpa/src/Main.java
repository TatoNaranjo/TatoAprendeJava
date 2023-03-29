import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i <testCases ; i++) {
            String pi = "314159265358979323846264338327";
            String [] pilist = pi.split("");
            int counter = 0;
        String poliNumeros = sc.next();
        String[] poliNumerosDivided = poliNumeros.split("");
        int n = poliNumerosDivided.length;
        for (int j = 0; j<n;j++){
        if(poliNumerosDivided[j]!= pilist[j]){
            counter++;
        }else{
            break;
        }

        }
            System.out.println(counter);
        counter = 0;
        }

    }
}