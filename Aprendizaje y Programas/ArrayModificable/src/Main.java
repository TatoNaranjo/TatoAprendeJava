import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Scanner sc = new Scanner(System.in);

    /*Función que permite agregar un elemento al final del vector */

    private static String[] agregarElemento(String[] arr, String element)
    {
        /* Si el vector está vacío se le pide al usuario que inserte elementos en el*/
        if(arr.length==0){
            System.out.println("El Vector está Vacío, Inserta elementos en el.");
            String[] array = new String[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                array[i]=arr[i];
            }
            array[arr.length] = element;
            return array;
        }
        /*Si el Vector está lleno no se puede agregar nada más*/
        if(arr.length>=10){
            System.out.println("El Vector Está lleno, No Puedes Hacer Agregar nada más");
            return arr;
        } else {
            String[] array = new String[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                array[i]=arr[i];
            }
            array[arr.length] = element;
            return array;
        }


    }
    /* Funcion que permite remover un Elemento del Vector*/
    public static String[] removerElemento(String[]arr,int index){
        if (arr.length<=0){
            System.out.println("No puedes Eliminar más Elementos, la lista está vacía");
            return arr;

        }
        String[] resultado = new String[arr.length - 1];
        System.arraycopy(arr, 0, resultado, 0, index);

        if (arr.length != index) {
            System.arraycopy(arr, index + 1, resultado, index, arr.length - index - 1);
        }
        return resultado;


    }
    /* Función que permite modificar un elemento en el Vector*/
    public static String[] modificarElemento(String[]arr,int index,String element){
        String[] resultado = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultado[i]=arr[i];
        }
        resultado[index]=element;
        return resultado;
    }

    public static void main(String[] args) {
        /*Valores Iniciales del Arreglo*/
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "C";
        arr[3] = "D";
        arr[4] = "E";
        arr[5] = "F";
        arr[6] = "G";
        arr[7] = "H";
        arr[8] = "I";
        arr[9] = "J";
    desicion();

    }
    static String[] arr = new String[10];

    /* Método que sirve para alternar entre las opciones de modificación del Array*/

    public static void multiswitch(int desicion){
        /* Si el vector está vacío se le pide al usuario que inserte elementos en el*/
            if(arr.length==0){
                System.out.println("El Vector está Vacío, Inserta elementos en el.");
            }
            /*Si el vector está lleno se le notifica al usuario*/
            if(arr.length>=10){
                System.out.println("Todas las Posiciones del Vector se Encuentran llenas");
            }
        switch (desicion) {
                /* Opcion 1: Agregar Elementos Al Vector*/
            case 1: {
                System.out.println(Arrays.toString(arr));
                System.out.println("Por Favor Escribe el Elemento que deseas Agregar");
                String elemento = sc.next();
                arr = agregarElemento(arr, elemento);
                System.out.println(Arrays.toString(arr));
                desicion();
            }
                /* Opción 2: Eliminar un Elemento del Vector*/
            case 2: {
                System.out.println("Por Favor Selecciona el indice del elemento que quieres eliminar [1-10]");
                System.out.println(Arrays.toString(arr));
                int posicion = sc.nextInt();
                arr = removerElemento(arr, posicion - 1);
                System.out.println(Arrays.toString(arr));
                desicion();
            }
                /* Opción 3: Reemplazar un Elemento en el Vector*/
            case 3: {
                System.out.println("Por favor selecciona el indice del elemento que quieres reemplazar [1-10]");
                System.out.println(Arrays.toString(arr));
                int index = sc.nextInt();
                System.out.println("Escribe el Texto por el que quieres reemplazar el valor inicial:");
                String texto = sc.next();
                arr = modificarElemento(arr, index - 1, texto);
                System.out.println(Arrays.toString(arr));
                desicion();
            }
            /*  Opción 4: Salir del programa*/
            case 4:{
                System.out.println("Muchas Gracias por utilizar mi programa");
                exit(0);
                break;
        }
            default:{
                break;
            }


        }
    }
    /* Método que Captura las Desiciones Tomadas por el Usuario*/
    public static void desicion(){
        try{
        System.out.println("---------------//---------------");
        System.out.println("Hola, Bienvenido al Sistema de Manipulación de vectores. \nEn este sistema podrás modificar el vector teniendo como tamaño máximo 10 posiciones.");
        System.out.println(Arrays.toString(arr));
        System.out.println("Por Favor Selecciona qué deseas hacer:");
        System.out.println("1. Agregar un Elemento al Arreglo");
        System.out.println("2. Eliminar un Elemento del Arreglo");
        System.out.println("3. Modificar un Elemento del Arreglo");
        System.out.println("4. Salir");
        int decision = sc.nextInt();
        if(decision==4) {
            System.out.println("Gracias Por Utilizar Mi Programa");
            exit(0);
        }
        System.out.println("---------------//---------------");
        multiswitch(decision);
        } catch (Exception e){
            System.out.println("Por Favor Ingresa un número Valido y Vuelve a Intentarlo.");

        }



    }
}