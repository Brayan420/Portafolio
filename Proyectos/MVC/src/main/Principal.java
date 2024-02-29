
package main;

import controllers.Controlador;
import models.modelo;
import views.Vista;


public class Principal {
    public static void main(String[] args){
        
        Vista vista_prueba = new Vista();
        modelo modelo_prueba = new modelo();
        Controlador controlador_prueba = new Controlador(vista_prueba, modelo_prueba);
        
        vista_prueba.setVisible(true);
    }
}
