package app;
import javax.swing.*;
public class Cola {

    Nodo primerElemento;
    Nodo ultimoElemento;
    int tamaño = 0;
    public Cola(){
        this.primerElemento = this.ultimoElemento = null;

    }

    //METODO ENQUEUE
 void InsertarAlInicio(int dato) {
     Nodo temporal = new Nodo(dato);
     if (primerElemento == null) {
         primerElemento = temporal;
         ultimoElemento = temporal;
     } else {
         temporal.sig = primerElemento;
         primerElemento.ant = temporal;
         primerElemento = temporal;
     }
     tamaño++;
 }
 //METODO DEQUEUE
    void EliminarAlInicio(){
        if(this.primerElemento == null){
            return;
        }
            Nodo temporal = this.primerElemento;
            this.primerElemento = this.primerElemento.sig;
            if(this.primerElemento == null){
                this.ultimoElemento = null;
            } else{
                this.primerElemento.ant = null;
            }
            tamaño--;

    }
    public void mostrar() {
        if(isVacio()){
            return;
        }
        String resultado = "";
        Nodo temp = primerElemento;
        while (temp != null) {
            resultado += temp.info + "--";
            temp = temp.sig;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    public boolean isVacio(){
        return tamaño==0;
    }
}
