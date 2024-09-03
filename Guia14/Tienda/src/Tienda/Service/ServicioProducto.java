/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Tienda.Entidades.Producto;

/**
 *
 * @author godoy
 */
public class ServicioProducto {
    private Producto p;
    private Scanner sc;
    private Connection conexion;

   
    public ServicioProducto(Connection conexion) {
        this.conexion = conexion;
    }
    
    public List <Producto> obtenerTodosLosProductos() throws SQLException{
        List<Producto> productos = new ArrayList <>();
        String query = "SELECT * from producto";
        try(Statement statement = conexion.createStatement();
           ResultSet r = statement.executeQuery(query)){
            while (r.next()) {
                int codigo = r.getInt("codigo");
                String nombre = r.getString("nombre");
                double precio = r.getDouble("precio");
                int codigoFabricante = r.getInt("codigo_fabricante");
                
                Producto p = new Producto (codigo, nombre, precio, codigoFabricante);
                productos.add(p);
            }
        }
        return productos;
    }
    
}
