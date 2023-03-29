import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nombre;

        // Bucle para pedir los datos de los trabajadores
        while (true) {
            System.out.print("Introduce el nombre del trabajador: ");
            nombre = scanner.nextLine();
            if (nombre.equals("*")) {
                break; // Se ha introducido el asterisco, terminar la introducción de datos
            }
            System.out.print("Introduce las horas trabajadas por " + nombre + ": ");
            int horas = Integer.parseInt(scanner.nextLine());

            // Crear un objeto Trabajador y añadirlo al ArrayList
            Trabajador trabajador = new Trabajador(nombre, horas);
            trabajadores.add(trabajador);
        }

        // Imprimir el salario de cada trabajador
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.getNombre() + " ha trabajado " + trabajador.getHoras() + " horas y su salario es de $" + trabajador.calcularSalario());
        }
    }
}


}