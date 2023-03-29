public class puntosMetodos extends Main{

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
            else System.out.println("El Elemento no Existe");
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


