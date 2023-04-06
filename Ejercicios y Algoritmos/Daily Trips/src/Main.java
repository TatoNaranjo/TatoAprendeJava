import java.util.Scanner;
public class Main {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       String x = sc.nextLine();
       String[] ans = x.split(" ");
       int testCases = Integer.parseInt(ans[0]);
       int a = Integer.parseInt(ans[1]);
       int b = Integer.parseInt(ans[2]);


       for (int i = 0; i < testCases; i++) {
           String rta = sc.nextLine();
           char rtachars[] = rta.toCharArray();
           char strA = rtachars[0];
           char strB = rtachars[2];
           String solA = "N";
           String solB = "N";
            if (strA == 89 || b == 0){
                a--;
                b++;
                solA = "Y";
            }

           if (strB == 89 || a == 0){
               b--;
               a++;
               solB = "Y";
           }
           System.out.println(solA + " " + solB);
       }
   }
}
