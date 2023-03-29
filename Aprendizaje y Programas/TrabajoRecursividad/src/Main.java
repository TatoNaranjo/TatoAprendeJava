/*
*  1. Sumar los números naturales hasta N de forma recursiva.
    2. Recorrer un Array de Forma Recursiva.
    3. Buscar un elemento de un Array en Forma Recursiva.
    4. Recorrer una matriz de Forma Recursiva.
    [1,2,3
    4,5,6
    7,8,9]
    5. Calcular el valor de la posición fibonacci.
    6. Invertir un numero de forma recursiva sin usar String.
    7. Calcular la potencia de un número de forma recursiva tanto para expresiones positivas como negativas.
* */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
        int a[] = {2,3,5,8,9,2,5};
        int b[][] ={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        // Inicio del Switch de las Elecciones para los ejercicios de recursividad
        switch (eleccion){
            case 1:
                System.out.println("Ingresa el numero hasta el que quieres sumar todos los números");
                int numero = sc.nextInt();
                System.out.println("La suma hasta "+ numero + " es: "+primerPunto(numero));
                break;
            case 2:
                System.out.println("Escriba la posición desde donde quiere empezar a recorrer el Vector");
                int posVector = sc.nextInt();
                segundoPunto(a,posVector);
                break;
            case 3:
                System.out.println("Ingresa el elemento que quieres buscar en el Vector: ");
                int elementoABuscar = sc.nextInt();
                tercerPunto(a,elementoABuscar,0);
                break;
            case 4:
                cuartoPunto(b,0,0);
                break;
            case 5:
                System.out.println("Ingresa el valor de la Posición Fibonacci");
                int posFibonacci = sc.nextInt();
                System.out.println(quintoPunto(posFibonacci));
                break;
            case 6:
                System.out.println("Ingresa el Número a Invertir:");
                int numInvertir = sc.nextInt();
                System.out.println("Numero sin Invertir: "+numInvertir);

                System.out.println("Número Invertido: "+ sextoPunto(numInvertir));
                break;
            case 7:
                System.out.println("Ingresa la base de la Potencia: ");
                int base = sc.nextInt();
                System.out.println("Ingresa el Exponente de la Potencia: ");
                int exponente = sc.nextInt();
                System.out.println(septimoPunto(base,exponente));
                break;
        }

        // Fin del Switch de las Elecciones para los ejercicios de recursividad

    }
    // Inicio del Primer Punto
    public static int primerPunto(int n){
        int valor;
        if(n==1){
        valor = 1;
        } else{
            valor =primerPunto(n-1)+n;
        }
        return valor;
    }

    // Fin del Primer Punto

    // Inicio del Segundo Punto
    public static void segundoPunto(int[] a, int i){

      if (i == a.length) return;
      else
          System.out.println("Posicion: " +i + " = "+a[i]);
          segundoPunto(a,i+1);
    }

    // Fin del Segundo Punto

    // Inicio del Tercer Punto
    static int contador = 0;
    static int hayElementos = 0;
    public static void tercerPunto (int []a, int elemento, int contador){
        if(contador==a.length) return;
        else{
            if (elemento == a[contador]){
                System.out.println("El numero "+elemento+" si existe y se encuentra en la posición "+(contador+(int)1));
                hayElementos++;
            }
            if(hayElementos==0 && contador == a.length-(int)1) System.out.println("El elemento que ingresaste no se encuentra en el Vector");
        }
        tercerPunto(a,elemento, contador+1);
    }
    // Fin del Tercer Punto

    // Inicio del Cuarto Punto
    public static void cuartoPunto (int [][]b, int posicionX, int posicionY){
        if (posicionX >= b.length || posicionY >= b[0].length) {
            return;
        }
        int actualElemento = b[posicionX][posicionY];
        System.out.println("Posición en x: "+posicionX+" Posición en Y: "+posicionY+  " Elemento:" + actualElemento);

        if(posicionY==b[0].length-1){
            cuartoPunto(b,posicionX+1,0);
        }else{
            cuartoPunto(b,posicionX,posicionY+1);
        }

    }

    // Fin del Cuarto Punto


    // Inicio del Quinto Punto
    public static int quintoPunto(int posicionFibonnaci){
        if (posicionFibonnaci==0) return 0;
        else if(posicionFibonnaci==1)return 1;
        else{
         return quintoPunto(posicionFibonnaci-1)+quintoPunto(posicionFibonnaci-2);
        }
    }

    // Fin del Quinto Punto

    // Inicio del Sexto Punto

    public static int sextoPunto(int numero){
        if(numero<10) return numero;
        else{
            int ultimoDigito = numero%10;
            int restoDelNumero = numero/10;
            int numeroInvertido = sextoPunto(restoDelNumero);
            return (ultimoDigito * (int)Math.pow(10, (int)Math.log10(numeroInvertido) + 1)) + numeroInvertido;
        }
    }

    // Fin del Sexto Punto

    // Inicio del Séptimo Punto

    public static double septimoPunto(int base, int exponente){
    if(exponente == 0) return 1;
    else if(exponente > 0) return base * septimoPunto(base, exponente-1);
    else return 1/(base * septimoPunto(base,-exponente-1));

    }

    // Fin del Séptimo Punto
}

