
package Empleado;

/**
 *
 * @author antho
 */
public class clase_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado_Asalariado p = new Empleado_Asalariado(32, " Luis ", " Cuvi ", 120);
        System.out.println(p);
        
        Empleador_comision e = new Empleador_comision(320, 430, " Luis ", " Cuvi ", 320);
        System.out.println(e);
        
        Empleado_por_horas h = new Empleado_por_horas(210, -320, " Luis ", " Cuvi ", 320);
        System.out.println(h);
        
        Empleado_base_mas_comision b = new Empleado_base_mas_comision(130, 540, 210, "Luis", "Cuvi", 650);
        System.out.println(b);
    }
    
}
