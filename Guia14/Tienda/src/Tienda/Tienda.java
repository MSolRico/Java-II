/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

import Tienda.Service.FabricanteServicio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SFC
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricanteServicio fs = new FabricanteServicio();
        
        try {
            fs.crearFabricante(123, "Reinaldo");
        } catch (Exception e) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}