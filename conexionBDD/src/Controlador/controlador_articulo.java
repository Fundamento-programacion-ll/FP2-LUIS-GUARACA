
package Controlador;

import com.mysql.jdbc.Connection;
import conexion.conector;

public class controlador_articulo {
    
    
    
    public void ingresarArticulos(){
        conector conexion = new conector();
        
        Connection ps = conexion.getConxion();
    }
    public void actualizar(){
        String queryUpdate = "update articulos set nombre=? where articulo=?";
    }
}
