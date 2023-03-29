import java.util.ArrayList;
import java.util.Scanner;

/*
* @author Santiago Naranjo Herrera.
* */

public class Main {

    public static void main(String[] args) {
    ArrayList <Trabajador> Trabajador = new ArrayList<>();


        String nombre;
        /* Inicio del Bucle Que Recoje Los Datos*/
        while(true) {
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("---------------//---------------");
            System.out.println("Por Favor Ingresa el Nombre del trabajador");
            nombre = sc.nextLine();

            if (nombre.equals("*")) {
                break;
            }
            System.out.println("--//--");
            System.out.println("Ingresa las Horas normales Trabajadas");
            int horas = sc.nextInt();
            int horasExtra = 0;
            System.out.println("--//--");
            System.out.println("Ingrese las Horas Extras trabajadas por " + nombre + " :");
            horasExtra = sc2.nextInt();

            Trabajador trab = new Trabajador(nombre,horas,horasExtra);
            Trabajador.add(trab);

            System.out.println("---------------//---------------");
        }
        /* Fin del Bucle Que Recoje Los Datos*/

        /* Ciclo Repetitivo que Muestra los Resultados en Pantalla*/

        for (Trabajador trabajador : Trabajador) {
            System.out.println(trabajador.getNombre() + " ha trabajado " + trabajador.getHoras() + " horas normales, "+ trabajador.getHorasExtra() + " horas extras, y su salario es de $" + trabajador.calculaSueldo());
        }
        /* Fin Del Ciclo Repetitivo que Muestra los Resultados en Pantalla*/


         }
    }

