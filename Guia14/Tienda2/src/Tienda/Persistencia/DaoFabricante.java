/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Persistencia;

import Tienda.Entidad.Fabricante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adriana N
 */
public final class DaoFabricante  extends Dao {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Fabricante> listarFabricantes() throws Exception{
        try {
            String sql = "Select * from fabricante";
            consultarBase(sql);
            Fabricante fab = null;
            ArrayList<Fabricante> lista = new ArrayList();
            while (resultado.next()) {
               fab = new Fabricante();
               fab.setCodigo(resultado.getInt(1));
               fab.setNombre(resultado.getString("nombre"));
               lista.add(fab);
            }
            desconectarBase();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
        public void AgregarFabricante() throws Exception {
        try {
            Fabricante fab = CrearFabricante();
            String sql = "INSERT INTO Fabricante ( codigo, nombre ) "  + 
            "VALUES ( '" + fab.getCodigo()+ "' , '" + fab.getNombre() + "' )";
            // System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Fabricante CrearFabricante(){
        System.out.println("Ingrese el Codigo");
        int codigo = leer.nextInt();
        System.out.println("Ingrese el Nombre del Fabricante");
        String nombre = leer.next();
        return new Fabricante(codigo, nombre);
    }
    
    
}
