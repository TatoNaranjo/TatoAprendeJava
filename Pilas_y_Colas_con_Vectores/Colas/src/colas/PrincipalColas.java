package colas;

/**
 * @author Fernel Moreno
 */
import javax.swing.JOptionPane;
public class PrincipalColas {
    public static void main(String[] 2args) {
        int lf=0, op=0, elemento=0;
        lf=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la Longitud de la Cola "));

        Cola objCol = new Cola(lf);
        String menu="M A N E J O   D E   C O L A S\n =============================\n1.- Insertar elemento\n"
                + "2.- Eliminar elemento\n3.- Display Cola\n4.- Finalizar\nEscoja la Opción:";
     	while(op!=4){
                op=Integer.parseInt(JOptionPane.showInputDialog(null,menu));
     		switch(op){
     			case 1: {
                                  elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Elemento a Insertar "));
                                  JOptionPane.showMessageDialog(null,objCol.insertar(elemento));
     			        }
     			        break;
     			case 2: {
                                 JOptionPane.showMessageDialog(null,objCol.eliminar());
     			        }
     			        break;
     			case 3: {
                                 JOptionPane.showMessageDialog(null,objCol.displayCola());
                               }
                               break;
     		}
     	}         
    }    
}
