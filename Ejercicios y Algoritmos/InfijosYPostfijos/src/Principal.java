import java.util.Scanner;
import java.util.Vector;

public class Principal {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Operación que desea pasar de InFijo a PosFijo");
        String[] expresion = sc.next().split(" ");

        Vector<String> respuesta = Metodos.infijoAPosfijo(expresion);
        String rta = "";
        for (String s:respuesta){
          rta += s;
        }
        System.out.println(rta);
    }

    }

