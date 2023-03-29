public class Nodo {
    Nodo ant;
    int info;
    Nodo sig;

    // Cada vez que se instancie un nuevo valor, se asigna a info y ant y sig son nulos.
    public Nodo(int info){
        this.info = info;
        this.ant = null;
        this.sig = null;

    }
}
