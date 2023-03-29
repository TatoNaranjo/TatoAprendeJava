package javaListas;
public class Lista{
    Nodo cab;
    int indOrd;
    public Lista(){
        cab = null;
        indOrd = 0;
    }
    public void crear(int[] datos, int n){
        Nodo ant = null, nuevo;

        for (int i = 0; i <n ; i++) {
            //Creando el Primer Elemento

            if(cab == null){
            cab = new Nodo (datos[i]);
            ant = cab;

            //Creando Un Nuevo Elemento

            } else{
                nuevo = new Nodo (datos[i]);
                ant.sig = nuevo;
                ant = nuevo;
            }
        }
    }

    public void mostrar(){
        Nodo p = cab;
        while (p!=null){
            System.out.println(p.info+ ", ");
            p = p.sig;
        }
    }
    public boolean modificar(int x, int y ){
        Nodo p = cab;
        while (p!= null){
            if(p.info == x){
                p.info = y;
                p = null;
                return true;
            } else{
              p = p.sig;
            }


        }
        return false;
    }

    public void ordenar(){
        Nodo p = cab, ant, sig;
        int indOrd, aux;
        while(p!=null){
            sig = cab.sig;
            ant = cab;
            while(sig != null){
                if(ant.info >sig.info){
                    aux = ant.info;
                    ant.info = sig.info;
                    sig.info = aux;
                }
                sig = sig.sig;
                ant = ant.sig;
            }
            p = p.sig;
        }
    }
    public void eliminar(int valorAEliminar){
        Nodo p = cab, ant, sig;
        Nodo anterior = null;
    while(p!=null) {
        while (p.sig != null) {
            if (p.sig.info == valorAEliminar) {
                if (anterior == null) {
                    p = p.sig;
                } else {
                    p.sig = p.sig;
                }
                return;
            }
            anterior = p;
            p = p.sig;
        }
    }
    }

}
