import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numAReducir = sc.nextInt();
        int vecesAReducir = sc.nextInt();

        for (int i = 0; i < vecesAReducir; i++) {
            if(numAReducir%10!=0)numAReducir--;
            else numAReducir=numAReducir/10;

        }
        System.out.println(numAReducir);
    }
}
