/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Service;

import Tienda.Entidad.Producto;
import Tienda.Persistencia.DaoProducto;
import java.util.Scanner;

/**
 *
 * @author Adriana N
 */
public class ServiceProducto {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DaoProducto product = new DaoProducto();
    public void MostrarProductos() throws Exception{
        for (Producto lista : product.listarProductos()) {
            System.out.println(lista.toString());
        }
    }
    
    public void mostrarXprecio() throws Exception{
        System.out.println("ingrese el precio 1");
        int n1 = leer.nextInt();
        System.out.println("ingrese el precio 2");
        int n2 = leer.nextInt();
        for (Producto lista : product.listarxprecio(n1, n2)) {
            System.out.println(lista.toString());
        }
    }
    
    public void MostrarNyP() throws Exception{
        for (Producto lista : product.listarProductos()) {
            System.out.println("Nombre : " + lista.getNombre() + ", Precio : "+ lista.getPrecio());
        }
    }
    
    public void MostrarPortatil() throws Exception{
        for (Producto lista : product.listarxportatil()) {
            System.out.println(lista.toString());
        }
    }
    
    public void Barato() throws Exception{
        for (Producto lista : product.barato()) {
            System.out.println(lista.toString());
        }
    }
    
    public void agregar() throws Exception{
        product.AgregarProducto();
    }
    
    public void ModificarUno() throws Exception{
        MostrarNyP();
        System.out.println("Cual producto desea traer seleccionar por nombre");
        Producto p = product.traerProducto(leer.next());
        System.out.println(p.toString());
        Producto n = new Producto();
        n.setCodigo(p.getCodigo());
        System.out.println("Ingrese el nuevo nombre");
        n.setNombre(leer.next());
        System.out.println("Ingrese el nuevo precio");
        n.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el nuevo codigo del fabricante");
        n.setCodigoFabricante(leer.nextInt());
        product.Modificado(n);
        
    }
}
