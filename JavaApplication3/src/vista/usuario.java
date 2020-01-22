/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.user;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class usuario {
    public void menu(){
        int opcion =0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu \n" +
                "Agregar Persona\n",this));
        
        switch(opcion){
            case 1:
                user metodos = new user();
                metodos.agregarPersonas("luis");
                break;
            case 2:
                metodos.listaPerosna();
                break;
            default:
                break;
        }
    }
    
}
