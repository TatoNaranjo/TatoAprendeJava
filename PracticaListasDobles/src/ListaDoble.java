public class ListaDoble {
private Nodo cabeza;

public ListaDoble(){
    cabeza=null;

}
public boolean crear(int[] datos,int n){
    Nodo nuevo;
    Nodo ant;
    for (int i = 0; i < n; i++) {
        if(cabeza==null){ // Si cabeza = null entonces es el Primero
            cabeza = new Nodo(datos[i]); //Crea un espacio en memoria y crea el primer nodo con el dato asignado
            ant = cabeza; // Se enlaza anterior.
        } else{
            nuevo = new Nodo(datos[i]); // Se crea otra area en memoria
            ant.sig = nuevo;// El viejo nodo apunta al nuevo.
            nuevo.ant = ant;
            ant = nuevo; // Anterior ya apunta hacia adonde estaba nuevo
        }
    }

}

    public void mostrar(){
    Nodo p = cabeza;
    String temporal = "";
    while(p != null){
        temporal += p.info + "";
    p = p.sig;
    }

    }

}
