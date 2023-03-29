package app;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class mainPila {
    public static void main(String[] args){
            int op=0,dato=0;
            int []v = new int[100];
            Pila  obL = new Pila();
            while(op!=9){
                op=Integer.parseInt(JOptionPane.showInputDialog(null,"MANEJO DE PILAS USANDO LISTAS DOBLEMENTE ENCADENADAS" +
                        "\n1.- INSERTAR ELEMENTO AL FINAL " +
                        "\n2.- ELIMINAR ELEMENTO DE PRIMERO" +
                        "\n3.- MOSTRAR LA LISTA" +
                        "\n9.- FINALIZAR" +
                        " \n  ESCOJA LA OPCION:"));
                switch(op){
                    case 1:{
                        dato=Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL VALOR A AGREGAR COMO ULTIMA POSICION"));
                        obL.insertarUltimo(dato);
                        JOptionPane.showMessageDialog(null,"EL DATO SE HA IMPORTADO CORRECTAMENTE");
                        break;
                    }
                    case 2:{

                        if(obL.estaVacio()){
                           JOptionPane.showMessageDialog(null,"LA LISTA SE ENCUENTRA VACÍA");
                        }
                        else{
                            obL.eliminarPrimero();
                            JOptionPane.showMessageDialog(null,"El ELEMENTO SE HA ELIMINADO CORRECTAMENTE");
                        }
                        break;
                    }
                    case 3:{
                        obL.mostrar();
                        break;
                    }
                }
            }
        }

    }
