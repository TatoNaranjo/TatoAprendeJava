package pilas;
/**
 * @author FERNEL MORENO
 */
import javax.swing.JOptionPane;
public class PrincipalPilas {
    public static void main(String[] args) {
        int lf=100, op=0, elemento=0;
        lf=Integer.parseInt(JOptionPane.showInputDialog(null,"Longitud de la Pila "));
        Pila objPil = new Pila (lf);
        String menu="M A N E J O   D E   P I L A S\n =============================\n1.- Insertar elemento en la PILA\n"
                + "2.- Eliminar elemento de la Pila\n3.- Display Pila\n4.- Finalizar\nEscoja la Opción:";
     	while(op!=4){
            op=Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            switch(op){
     		case 1: {
                          elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Elemento a Insertar "));
                          JOptionPane.showMessageDialog(null,objPil.insertar(elemento));
     	            }
                    break;
     		case 2: {
                        JOptionPane.showMessageDialog(null,objPil.eliminar());
                    }
     		    break;
     		case 3: {
                        JOptionPane.showMessageDialog(null,objPil.displayPila());
                    }
     		    break;
     	    }
        }        
    }
} 