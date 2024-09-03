/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Service;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    private FabricanteDAO dao;
    
    public FabricanteServicio(){
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(int codigo, String nombre) throws Exception {
        try {
            Fabricante fabricante = new Fabricante();
        fabricante.setCodigo(codigo);
        fabricante.setNombre(nombre);
        dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
