/*import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int length = sc.nextInt();
            int vec[] = new int [length];
            int rta = -1;
            for (int j = 0; j < length; j++) {
                vec[j] = sc.nextInt();
            }
            for (int j = 0; j < vec.length; j++) {
                int contadorRepeticiones = -1;
                for (int k = 0; k < vec.length; k++) {
                    if (vec[j]==vec[k]){
                        contadorRepeticiones++;
                    }
                    if(contadorRepeticiones==2){
                       rta = vec[j];
                        break;
                    }
                    }

            }
            System.out.println(rta);
        }
    }
}
*/
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int length = sc.nextInt();
            int vec[] = new int[length];
            int rta = -1;
            for (int j = 0; j < length; j++) {
                vec[j] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < vec.length; j++) {
                if (map.containsKey(vec[j])) {
                    map.put(vec[j], map.get(vec[j]) + 1);
                } else {
                    map.put(vec[j], 1);
                }
                if (map.get(vec[j]) == 3) {
                    rta = vec[j];
                    break;
                }
            }
            System.out.println(rta);
        }
    }
}