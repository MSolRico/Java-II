/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Service;

import java.util.Scanner;

/*a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
public class Service {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServiceProducto sp = new ServiceProducto();
    ServiceFabricante sf = new ServiceFabricante();

    public void menu() throws Exception {
        int opc;
        do {
            System.out.println(">> Menu <<");
            System.out.println("1)_ Mostrar todos los productos");
            System.out.println("2)_ Mostrar todos los productos X nombre y precio");
            System.out.println("3)_ Mostrar por parametro de precios");
            System.out.println("4)_ Mostrar X portatil ");
            System.out.println("5)_ Buscar el/los productos mas baratos");
            System.out.println("6)_ Ingresar Producto");
            System.out.println("7)_ Ingresar Fabricante");
            System.out.println("8)_ Editar Producto");
            System.out.println("9)_  Mostrar fabricantes");
            System.out.println("10)_ Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    sp.MostrarProductos();
                    break;
                case 2:
                    sp.MostrarNyP();
                    break;
                case 3:
                    sp.mostrarXprecio();
                    break;
                case 4:
                    sp.MostrarPortatil();
                    break;
                case 5:
                    sp.Barato();
                    break;
                case 6:
                    sp.agregar();
                    break;
                case 7:
                    sf.AgregarFabricante();
                    break;
                case 8:
                    sp.ModificarUno();
                    break;
                case 9:
                    sf.MostrarFabricantes();
                    break;
                case 10:
                    System.out.println("hasta luego");
                    break;
                default:
                    System.out.println("Digito Invalido");
            }
        } while (opc != 10);
    }

}
