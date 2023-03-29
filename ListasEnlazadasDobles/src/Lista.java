public class Lista {
    //Primero
    static Nodo cab;
    //Ultimo
    static Nodo ant;
    int length;
    int indord = 0;
public Lista(){
    this.cab = null;
    this.ant = null;
    this.indord = 0;
    this.length = 0;
}

// Al Momento de Crear la Lista Agrega todos los elementos al final

    public Lista(int[] elementos) {
        this();
        for (int elemento : elementos) {
            agregarAlFinal(elemento);

        }
    }



    /*Inicio del método para agregar valores al inicio*/
   // public void agregarAlPrincipio(int valor) {
       // Nodo nodoNuevo = new Nodo(valor);
        //if (this.ant == null) {
       //     this.ant = nodoNuevo;
       //     this.cab = nodoNuevo;
     //       length++;
   //     } else {
 //           nodoNuevo.sig = this.cab;
            //this.cab.ant = nodoNuevo;
          //  this.cab = nodoNuevo;
        //    length++;
      //  }
    //    indord = 0;
  //  }
    /* Fin del Método para agregar valores al inicio*/


    /*Inicio del método para agregar valores al Final*/
    public void agregarAlFinal(int valor){
        Nodo nodoNuevo = new Nodo(valor);
        if(this.ant == null){
            this.cab = nodoNuevo;
            this.ant = nodoNuevo;
        }
        else {
            nodoNuevo.ant = this.ant;
            this.ant.sig = nodoNuevo;
            this.ant = nodoNuevo;
        }
        ordenarListaDoble();
        indord = 1;
        this.length++;
    }
    /*Fin del método para agregar valores al Final*/

    /* Inicio del Método Imprimir*/
    public void imprimir(){
        Nodo nodoActual = cab;

            while (nodoActual != null) {
                System.out.println(nodoActual.info);
                nodoActual = nodoActual.sig;
            }

    }
    /*Fin del Metodo Imprimir */


    /* Inicio del Metodo para buscar un valor dentro de una Lista Doblemente Enlazada*/
    public Nodo buscar (int valor){
        Nodo actual = this.cab;
        while(actual != null && actual.info != valor){
            actual = actual.sig;
        }
        return actual;
    }

    /* Din del Metodo para buscar un valor dentro de una Lista Doblemente Enlazada */

    /*Inicio del Metodo Eliminar*/
    public void eliminar(int valor){
        Nodo actual = this.buscar(valor);

        if (actual != null) {
            if (actual == this.cab) {
                this.cab = actual.sig;
                if (this.cab != null) {
                    this.cab.ant = null;
                } else {
                    this.ant = null;
                }
            } else if (actual == this.ant) {
                this.ant = actual.ant;
                if (this.ant != null) {
                    this.ant.sig = null;
                } else {
                    this.cab = null;
                }
            } else {
                actual.ant.sig = actual.sig;
                actual.sig.ant = actual.ant;
            }
            this.length--;
        }
        imprimir();
    }
    /*Fin del Metodo Eliminar*/

    /* Inicio del Metodo para modificar un elemento en una lista enlazada Doble*/

    public void modificarElemento(int valorAnterior, int valorNuevo) {
        Nodo actual = cab;
        while(actual != null) {
            if(actual.info == valorAnterior) {
                actual.info = valorNuevo;
                break;
            }
            actual = actual.sig;
        }
    }
    /* Fin del Método para modificar un elemento en una lista enlazada Doble*/


    public void ordenarListaDoble() {
        Nodo actual;
        Nodo siguiente;
        int temp;
        actual = cab;
        while(actual != null) {
            siguiente = actual.sig;
            while(siguiente != null) {
                if(actual.info > siguiente.info) {
                    temp = actual.info;
                    actual.info = siguiente.info;
                    siguiente.info = temp;
                }
                siguiente = siguiente.sig;
            }
            actual = actual.sig;
        }
        indord= 1;
    }
}
