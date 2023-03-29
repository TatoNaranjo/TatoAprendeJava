package app;

import javax.swing.*;

public class Pila {
    Nodo cabeza;
    Nodo cola;
    int tamaño = 0;
   public Pila(){
       cabeza = null;
       this.tamaño = 0;
   }
   // MÉTODO PUSH
   public void insertarUltimo(int valor){
    Nodo nodoNuevo = new Nodo(valor);
    if(tamaño==0){
        cabeza = cola = nodoNuevo;
    } else {
        cola.sig = nodoNuevo;
        nodoNuevo.ant = cola;
        cola = nodoNuevo;
    }
    tamaño++;
   }
   //MÉTODO POP
   public void eliminarPrimero(){
       if(estaVacio()){

           return;
       }
       else if (tamaño == 1){
        cabeza = cola = null;
       } else{
           cabeza = cabeza.sig;
           cabeza.ant = null;
       }
       tamaño--;



   }
    public int getPrimero(){
       return cabeza.info;
   }
   public int getUltimo (){
       return cola.info;
   }

   public boolean estaVacio(){
       return tamaño == 0;
   }

   public int tamaño(){
       return tamaño;
   }
    public void mostrar() {
        String resultado = "";
        Nodo temp = cabeza;
        while (temp != null) {
            resultado += temp.info + "--";
            temp = temp.sig;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}