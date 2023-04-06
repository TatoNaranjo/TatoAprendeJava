import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int x = 1 << n;
        x--;

        int count = 0;
        for (int i = 0; i <= x; i++) {
            int z = i;
            for (int j = 0; j < n; j++) {
                if ((z & 1) == 1) count = count + a[j];
                else count = count - a[j];
                z = z >> 1;

            }


            if (count == 0 || count % 360 == 0) {
                System.out.println("YES");
                return;
            }
            count = 0;
        }
        System.out.println("NO");
    }
}
/*
En el código, la máscara de bits se utiliza para generar todas las posibles combinaciones de los n números y verificar si alguna de ellas
cumple con la condición de que la suma de los números en cada grupo sea igual.

La variable x se inicializa con el valor 1 << n, que es igual a 2^n. Esto significa que hay 2^n posibles combinaciones de los n números.
Luego, el programa utiliza un bucle for para iterar sobre todas las combinaciones posibles. En cada iteración, se utiliza la variable z como una máscara de bits para determinar qué números deben sumarse y cuáles deben restarse.

La operación (z & 1) verifica si el bit menos significativo de z es igual a 1. Si es así, el número correspondiente se suma a la variable count.
De lo contrario, se resta. Luego, la variable z se desplaza un bit hacia la derecha utilizando la operación z = z >> 1.
Esto mueve el siguiente bit a la posición del bit menos significativo para que pueda ser verificado en la siguiente iteración del bucle interno.

Finalmente, si el valor de count es igual a 0 o es divisible por 360, el programa imprime “YES” y termina.
De lo contrario, continúa con la siguiente combinación hasta que se hayan verificado todas las combinaciones posibles.

Si pasas n = 3 y los elementos 10, 20 y 30 al código, el programa verificará si es posible dividir estos tres números en dos grupos de tal manera que
la suma de los números en cada grupo sea igual.

Primero, el programa lee el valor de n y los n números. Luego, inicializa la variable x con el valor 1 << n, que es igual a 2^n.
En este caso, x = 1 << 3 = 8, lo que significa que hay 8 posibles combinaciones de los 3 números.

Luego, el programa utiliza un bucle for para iterar sobre todas las combinaciones posibles.
En cada iteración, se utiliza la variable z como una máscara de bits para determinar qué números deben sumarse y cuáles deben restarse.

En la primera iteración, z = 0, lo que significa que todos los bits de la máscara son 0.
Por lo tanto, todos los números se restan y el valor de count es -10 - 20 - 30 = -60.
Como -60 no es igual a 0 ni es divisible por 360, el programa continúa con la siguiente combinación.

En la segunda iteración, z = 1, lo que significa que el bit menos significativo de la máscara es 1 y los demás son 0.
Por lo tanto, el primer número se suma y los demás se restan.
El valor de count es 10 - 20 - 30 = -40. Como -40 no es igual a 0 ni es divisible por 360, el programa continúa con la siguiente combinación.

El programa continúa iterando sobre todas las combinaciones posibles hasta que se hayan verificado todas.
En este caso, ninguna de las combinaciones cumple con la condición de que la suma de los números en cada grupo sea igual.
Por lo tanto, el programa imprime “NO” y termina.
* */