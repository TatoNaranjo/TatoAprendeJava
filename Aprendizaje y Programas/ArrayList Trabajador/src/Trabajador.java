
class Trabajador extends Main{

    /* Encapsulamiento de Variables*/
    private String nombre;
    private int horas;
    private int horasExtra;

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }
    public int getHorasExtra(){return horasExtra;}

    /* Fin del Encapsulamiento de Variables*/

    /* Creando el Constructor Sobrecargado de la Clase Trabajador*/

    public Trabajador(String nombre, int horas, int horasExtra){
        this.nombre = nombre;
        this.horas = horas;
        this.horasExtra = horasExtra;
    }

/* Fin del Metodo Sobrecargado*/


    /* Inicio del Metodo Para Calcular el Sueldo*/
public int calculaSueldo(){
        int salario = horas*6000;
        int hrasExtra = 0;
        if(horasExtra <10){
            hrasExtra = horasExtra*7000;
        }
        if(horasExtra >10){
            hrasExtra = horasExtra+8500;
        }
        int salarioTotal = salario+hrasExtra;
        return salarioTotal;
}
    /* Fin del Metodo Para Calcular el Sueldo*/

}