
public class Empleado_por_comision extends Empleado{
    private double ventas_brutas;
    private double tarifa_comision;

    public double getVentas_brutas() {
        return ventas_brutas;
    }

    public void setVentas_brutas(double ventas_brutas) {
        this.ventas_brutas = ventas_brutas;
    }

    public double getTarifa_comision() {
        return tarifa_comision;
    }

    public void setTarifa_comision(double tarifa_comision) {
        this.tarifa_comision = tarifa_comision;
    }

    public Empleado_por_comision(double ventas_brutas, double tarifa_comision, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.ventas_brutas = ventas_brutas;
        this.tarifa_comision = tarifa_comision;
    }

    @Override
    public double calcular_ingresos() {
        return 0;
       
    }
    
}
