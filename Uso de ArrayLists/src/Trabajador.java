public class Trabajador extends Main {
    private String nombre;
    private int horas;

    public Trabajador(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int calcularSalario() {
        int salario = horas * 6000; // salario base por horas normales
        int horasExtras = horas - 40; // horas extras (más de 10)
        if (horasExtras > 0) {
            if (horasExtras <= 10) {
                salario += horasExtras * 7000; // horas extras a $7000
            } else {
                salario += 10 * 7000; // las primeras 10 horas extras a $7000
                salario += (horasExtras - 10) * 8500; // el resto de horas extras a $8500
            }
        }
        return salario;
    }
}
