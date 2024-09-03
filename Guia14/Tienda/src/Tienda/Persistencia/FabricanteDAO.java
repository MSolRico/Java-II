/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author SFC
 */
public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO Fabricante ( codigo, nombre )"
                    + "VALUES ( " + fabricante.getCodigo() + " , '" + fabricante.getNombre() + "' );";
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante que desea modificar");
            }
            String sql = "UPDATE Fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = " + fabricante.getCodigo();
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM Fabricante WHERE codigo = " + codigo;
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception{
        try {
            String sql = "SELECT * FROM Fabricante "
                    + " WHERE codigo = " + codigo;
            consultarBase(sql);
            
            Fabricante fabricante = null;
            
            while(resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setNombre(resultado.getString(2));
                fabricante.setCodigo(resultado.getInt(3));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception{
        try {
            String sql = "SELECT codigo, nombre FROM Fabricante ";

            consultarBase(sql);
            
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while(resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setNombre(resultado.getString("nombre"));
                fabricante.setCodigo(resultado.getInt(1));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
}
