import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String palabra1 = "";
        String palabra2 = "";
        for (int i = 0; i < arr1.length ; i++) {
            palabra1+=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            palabra2+=arr2[i];
        }
        boolean confirmacion = false;
        if(palabra1==palabra2){confirmacion=true;}
        else{
           confirmacion=false;

        }
        if(confirmacion){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}