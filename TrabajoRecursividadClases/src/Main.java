import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        puntosMetodos m = new puntosMetodos();
        Scanner sc = new Scanner(System.in);

        // Inicio de las Opciones de Recursividad

        System.out.println("Bienvenido al Sistema de Ejercicios de Recursividad");
        System.out.println("Por Favor Elige La Función Que Deseas Hacer:");
        System.out.println(" 1. Sumar los números naturales hasta N de forma recursiva.\n" +
                "    2. Recorrer un Vector de Forma Recursiva.\n" +
                "    3. Buscar un elemento en un Vector en Forma Recursiva.\n" +
                "    4. Recorrer una matriz de Forma Recursiva.\n" +
                "    [1,2,3\n" +
                "     4,5,6\n" +
                "     7,8,9]\n" +
                "    5. Calcular el valor de la posición fibonacci.\n" +
                "    6. Invertir un numero de forma recursiva sin usar String.\n" +
                "    7. Calcular la potencia de un número de forma recursiva tanto para expresiones positivas como negativas.");

        // Fin de las Opciones de Recursividad


        int eleccion = sc.nextInt();
        int a[] = {2, 3, 5, 8, 9, 2, 5,20,40,7};
        int b[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        // Inicio del Switch de las Elecciones para los ejercicios de recursividad
        switch (eleccion) {
            case 1:
                System.out.println("Ingresa el numero hasta el que quieres sumar todos los números");
                int numero = sc.nextInt();
                System.out.println("La suma hasta " + numero + " es: " +m.primerPunto(numero));
                break;
            case 2:
                System.out.println("Escriba la posición desde donde quiere empezar a recorrer el Vector");
                int posVector = sc.nextInt();
                m.segundoPunto(a, posVector);
                break;
            case 3:
                System.out.println("Ingresa el elemento que quieres buscar en el Vector: ");
                int elementoABuscar = sc.nextInt();
                m.tercerPunto(a, elementoABuscar, 0);
                break;
            case 4:
                m.cuartoPunto(b, 0, 0);
                break;
            case 5:
                System.out.println("Ingresa el valor de la Posición Fibonacci");
                int posFibonacci = sc.nextInt();
                System.out.println(m.quintoPunto(posFibonacci));
                break;
            case 6:
                System.out.println("Ingresa el Número a Invertir:");
                int numInvertir = sc.nextInt();
                System.out.println("Numero sin Invertir: " + numInvertir);

                System.out.println("Número Invertido: " + m.sextoPunto(numInvertir));
                break;
            case 7:
                System.out.println("Ingresa la base de la Potencia: ");
                int base = sc.nextInt();
                System.out.println("Ingresa el Exponente de la Potencia: ");
                int exponente = sc.nextInt();
                System.out.println(m.septimoPunto(base, exponente));
                break;
        }
    }
}