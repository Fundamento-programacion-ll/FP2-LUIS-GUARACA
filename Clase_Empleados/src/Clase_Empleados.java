



public class Clase_Empleados {

   
    public static void main(String[] args) {
        
        Empleado_salario p= new Empleado_salario
        (-12, "luis", "cuvi", 450);
        System.out.println(p);
        Empleado_base_mas_comision ec= new Empleado_base_mas_comision
        (2, 3, 4, "Luis", "apellido", 0);
        System.out.println(ec);
        Empleado_por_Horas eh= new Empleado_por_Horas
        (12, 15,"Luis", "apellido", 0);
        System.out.println(eh);
        
    }
    
}
