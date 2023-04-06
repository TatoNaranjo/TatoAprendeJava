import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        // Base
        long n = sc.nextLong();
        //Altura
        long m = sc.nextLong();
        // Longitud y Altura del cuadrado
        long a = sc.nextLong();

        //Contador de cuadrados a lo largo del Rectángulo
        long contarn = n/a;
        //Contador de cuadrados a lo ancho del Rectángulo
        long contarm = m/a;

        //Si el módulo de la base o la altura por el cuadrado es diferente a 0
        //Significa que aún hay espacios disponibles, por tanto, se suma 1 a los cuadrados de
        //Cada Lado
        if (m%a != 0)contarm++;
        if (n%a != 0)contarn++;
        System.out.println(contarm*contarn);
    }
}
