
/**
 * @author USUARIO
 */
package javaListas;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Principal {
    static Scanner teclado;
    static PrintStream Escriba;

    public static void main(String[] args) {
 	int op=0,i,dato=0,cambio=0;
        Escriba = System.out;
        teclado = new Scanner(System.in);
        int []v = new int[100];
        Lista  obL = new Lista();
	while(op!=9){
	   Escriba.println("\n\n1 MANEJO DE LISTAS ENCADENADAS");
	   Escriba.println("   1.- CREAR LISTA ");
	   Escriba.println("   2.- MODIFICAR LISTA");
	   Escriba.println("   3.- ELIMINAR LISTA ");
	   Escriba.println("   4.- MOSTRAR LA LISTA");
	   Escriba.println("   5.- ORDENAR LA LISTA");
	   Escriba.println("   6.- INSERTAR UN ELEMENTO");
	   Escriba.println("   9.- FINALIZAR ");
	   Escriba.print("      ESCOJA LA OPCION: ");
	   op=teclado.nextInt();
	   switch(op){
	         case 1:{ i=0;
                          while(dato != -1){
                            dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite elemento -1 para finalizar."));
                            if (dato != -1)
                               v[i++]=dato;
                          }
                          obL.crear(v,i);
                        }
	                  break;
	    	 case 2: {
                          dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Dato Buscado."));
                          cambio=Integer.parseInt(JOptionPane.showInputDialog(null, "Dato con el que se va a cambiar"));
                          if (obL.modificar(dato,cambio))
                             System.out.println("Elemento cambiado");
                          else
                             System.out.println("No existe el elmento buscado");
                         }
                         break;
	    	 case 3: {
                           dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Dato Buscado para eliminar"));
                           if(obL.eliminar(dato)==false){
                               JOptionPane.showMessageDialog(null, "Lista Vacía..");
                           }
                         }
                         break;
	    	 case 4: obL.mostrar();
	    	         break;
	    	 case 5: obL.ordenar();
                         JOptionPane.showMessageDialog(null, "Finalizó de Ordenar....");
	    	         break;
	    	 case 6: {
                          dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Dato a Insertar."));
                          if (obL.indicadorOrd()==1){
                                if (obL.insertar(dato)==false)
                                    JOptionPane.showMessageDialog(null, "Lista Vacía..");
                          }
                          else{
                              JOptionPane.showMessageDialog(null, "Lista No esta Ordenada..");
                          }
                         }
                         break;
	    	 case 7: //oLE.menuListaOrdenada();
	    	         break;
	       }
        }
    }

    }    
}
