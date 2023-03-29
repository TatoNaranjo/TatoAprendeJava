package app;
import javax.swing.*;
public class mainCola {
    public static void main(String[] args){
        int op=0,i,dato=0;
        int []v = new int[100];
        Cola  obL = new Cola();
        while(op!=9){
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"MANEJO DE COLAS USANDO LISTAS DOBLEMENTE ENLAZADAS" +
                    "\n1.- INSERTAR ELEMENTO AL INICIO DE LA COLA " +
                    "\n2.- ELIMINAR ELEMENTO AL INICIO DE LA COLA" +
                    "\n3.- MOSTRAR LA LISTA" +
                    "\n9.- FINALIZAR" +
                    " \n  ESCOJA LA OPCIÓN:"));
            switch(op){
                case 1:{
                    dato=Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL VALOR A AGREGAR COMO PRIMERA POSICIÓN"));
                    obL.InsertarAlInicio(dato);
                    JOptionPane.showMessageDialog(null,"EL DATO SE HA IMPORTADO CORRECTAMENTE");
                    break;
                }
                case 2:{
                    if(obL.isVacio()){
                        JOptionPane.showMessageDialog(null,"LA LISTA ESTÁ VACÍA");
                        break;
                    }
                    else{
                        obL.EliminarAlInicio();
                        JOptionPane.showMessageDialog(null,"El ELEMENTO SE HA ELIMINADO CORRECTAMENTE");
                    }

                    break;
                }
                case 3:{
               if(obL.isVacio()){
                   JOptionPane.showMessageDialog(null,"LA LISTA ESTÁ VACÍA");
                   break;
               }else{
                   obL.mostrar();
                   break;
               }
                }
            }
        }
    }
}
