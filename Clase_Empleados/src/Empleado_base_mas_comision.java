
public class Empleado_base_mas_comision extends Empleado_por_comision{
    
    
   private double salariobase;

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public Empleado_base_mas_comision(double salariobase, double ventas_brutas, double tarifa_comision, String nombre, String apellido, int ci) {
        super(ventas_brutas, tarifa_comision, nombre, apellido, ci);
        this.salariobase = salariobase;
    }
   
    public double ingresos(){
        return  salariobase *super.calcular_ingresos();
    }
    
}
