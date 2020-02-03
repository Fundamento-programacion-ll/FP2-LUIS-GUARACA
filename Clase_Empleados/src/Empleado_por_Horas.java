
public class Empleado_por_Horas extends Empleado{
    private double sueldo;
    private double horas;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = ((horas >0 && horas <=168) ? horas: 0);
    }

    public Empleado_por_Horas(double sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    @Override
    public double calcular_ingresos() {
        return horas * sueldo;
        
    }

    
}
