public class ListaDCircular {


    Nodo cab,primero,ultimo = null;


public void crear(int[] datos, int n){
    Nodo nuevo = null;
    for (int i = 0; i<n;i++){
        if(primero == null){
            nuevo = new Nodo(datos[i]);
            cab = nuevo; primero = nuevo;
            ultimo = nuevo;
            primero.sig = primero;
        }
        else{
            nuevo = new Nodo(datos[i]);
            ultimo.sig =nuevo;
            nuevo.sig = primero;
            nuevo.ant = ultimo;
            ultimo = nuevo;
            primero.ant = ultimo;
        }
    }

}
public String mostrar(){
    Nodo actual = primero;
    String todo = "";
    if(primero != null){
        do{
            todo += actual.info+"-->";
            actual = actual.sig;
        }while(actual == primero);

    } else{
        todo = "Lista Vacía";
    }
    return todo;

}



}
