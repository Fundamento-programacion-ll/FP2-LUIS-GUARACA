
public class Empleado_salario  extends Empleado{

    public double getSalario_semanal() {
        return Salario_semanal;
    }

    public void setSalario_semanal(double Salario_semanal) {
        this.Salario_semanal = Salario_semanal;
    }
    
    private double Salario_semanal;

    public Empleado_salario(double Salario_semanal, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.Salario_semanal = Salario_semanal;
   
    
}

    @Override
    public double calcular_ingresos() {
     return 0.0;   
    }
}
