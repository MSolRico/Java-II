package Tienda.Persistencia;

import Tienda.Entidad.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public final class DaoProducto extends Dao {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Producto> listarProductos() throws Exception {
        try {
            String sql = "Select * from producto";
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    // Listar aquellos productos que su precio esté entre 120 y 202.
    public ArrayList<Producto> listarxprecio(int a, int b) throws Exception {
        try {
            String sql = "Select * from producto where precio between " + a + " and " + b + " order by precio desc";
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    // d) Buscar y listar todos los Portátiles de la tabla producto.
    public ArrayList<Producto> listarxportatil() throws Exception {
        try {
            String sql = "Select * from producto where nombre like 'portatil%' ";
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    // e) Listar el nombre y el precio del producto más barato.
    public ArrayList<Producto> barato() throws Exception {
        try {
            String sql = "select p.* from producto p where precio = (select min(pro.precio) from producto pro ) ";
            consultarBase(sql);
            Producto prod = null;
            ArrayList<Producto> list = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt(4));
                list.add(prod);
            }
            desconectarBase();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void AgregarProducto() throws Exception {
        try {
            Producto pro = CrearProducto();
            String sql = "INSERT INTO Producto ( codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + pro.getCodigo() + "' , '" + pro.getNombre() + "' , '" + pro.getPrecio() + "' , '" + pro.getCodigoFabricante() + "' )";
            // System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Producto CrearProducto() {
        System.out.println("Ingrese el Codigo");
        int codigo = leer.nextInt();
        System.out.println("Ingrese el Nombre del Producto");
        String nombre = leer.next();
        System.out.println("Ingrese el Precio");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el codigo del Fabricante");
        int codigoF = leer.nextInt();
        return new Producto(codigo, nombre, precio, codigoF);
    }

    public Producto traerProducto(String nuevo) throws Exception {
        try {
            String sql = "Select * from producto where nombre like '%"+ nuevo + "%'" ;
            consultarBase(sql);
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return prod;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public void Modificado(Producto nuevo) throws Exception{ 
  try {
            String sql = "UPDATE Producto SET " + 
                   " nombre = '" + nuevo.getNombre() + "' , precio = '" + nuevo.getPrecio() + 
                    "' , codigo_fabricante = '" + nuevo.getCodigoFabricante() + "' where codigo = " + nuevo.getCodigo() ;
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

}
